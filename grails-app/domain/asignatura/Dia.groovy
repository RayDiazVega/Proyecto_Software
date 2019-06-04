package asignatura

import grails.rest.*

@Resource(uri='/dia')
class Dia{
    String name
    Asignatura clas

    static constraints = {
        name blank: false
        clas blank: false
    }
}
