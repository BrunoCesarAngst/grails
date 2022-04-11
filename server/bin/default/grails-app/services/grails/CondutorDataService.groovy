package grails

import grails.gorm.services.Service

@Service(Condutor)
interface CondutorDataService {

    Condutor save(String nome)
}