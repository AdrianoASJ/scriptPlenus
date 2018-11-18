package scriptplenus

import grails.rest.Resource

@Resource(uri='/evento')
class Evento {

    Usuario criador
    String titulo
    String tema
    String descricao

    static hasMany = [desafio: Desafio]

    static constraints = {
    }
}
