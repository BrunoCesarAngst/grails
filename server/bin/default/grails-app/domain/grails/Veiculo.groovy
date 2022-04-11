package grails

import grails.rest.Resource

@Resource(uri = '/veiculo')
class Veiculo {

    String nome
    Fabricante fabricante
    Modelo modelo

    // O veiculo pertence a um condutor
    static belongsTo = [condutor: Condutor]
}
