package grails

import groovy.transform.CompileStatic

@CompileStatic
class BootStrap {

    CondutorDataService condutorDataService

    FabricanteDataService fabricanteDataService

    ModeloDataService modeloDataService

    VeiculoDataService veiculoDataService

    def init = { servletContext ->
        log.info "Lendo a Base de dados"

        Condutor condutorA = condutorDataService.save("Bruno")
        Condutor condutorB = condutorDataService.save("Marga")

        Fabricante chevrolet = fabricanteDataService.save("Chevrolet")
        Fabricante ford = fabricanteDataService.save("Ford")
        Fabricante fiat = fabricanteDataService.save("Fiat")

        Modelo meriva = modeloDataService.save("meriva")
        Modelo gol = modeloDataService.save("Gol")
        Modelo uno = modeloDataService.save("Uno")

        veiculoDataService.save("Class", condutorA, chevrolet, meriva)
        veiculoDataService.save("G7", condutorB, ford, gol)
        veiculoDataService.save("Way", condutorB, fiat, uno)
    }

    def destroy = {
    }
}
