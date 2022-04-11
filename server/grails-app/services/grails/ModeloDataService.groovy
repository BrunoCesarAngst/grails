package grails

import grails.gorm.services.Service

@Service(Modelo)
interface ModeloDataService {

    Modelo save(String nome)
}