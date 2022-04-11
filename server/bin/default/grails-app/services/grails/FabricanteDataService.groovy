package grails

import grails.gorm.services.Service

@Service(Fabricante)
interface FabricanteDataService {

    Fabricante save(String nome)
}
