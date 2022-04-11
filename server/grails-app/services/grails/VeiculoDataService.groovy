package grails

import grails.gorm.services.Service

@Service(Veiculo)
interface VeiculoDataService {

    Veiculo save(String nome, Condutor condutor, Fabricante fabricante, Modelo modelo)
}