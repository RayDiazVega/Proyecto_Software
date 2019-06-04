package asignatura

import grails.rest.*

@Resource(uri='/asignatura')
class Asignatura {

    String name
    String ncr
    String startHour
    String finalHour
    String room

    static constraints = {
        name blank: false
        ncr blank: false
        startHour blank: false
        finalHour blank: false
        room blank: false

    }
}

