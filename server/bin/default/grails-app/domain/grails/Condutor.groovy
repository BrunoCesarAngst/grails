package grails

import grails.rest.Resource

@Resource(uri = '/condutor')
class Condutor {

    String nome

    // Um condutor pode ter muitos veículos
    static hasMany = [veiculos: Veiculo]

    // Um condutor pode não ter veículo
    static constraints = {
        veiculos nullable: true
    }
}
