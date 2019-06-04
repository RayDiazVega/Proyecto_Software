package asignatura

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class DiaController {

    DiaService diaService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond diaService.list(params), model:[diaCount: diaService.count()]
    }

    def show(Long id) {
        respond diaService.get(id)
    }

    def create() {
        respond new Dia(params)
    }

    def save(Dia dia) {
        if (dia == null) {
            notFound()
            return
        }

        try {
            diaService.save(dia)
        } catch (ValidationException e) {
            respond dia.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'dia.label', default: 'Dia'), dia.id])
                redirect dia
            }
            '*' { respond dia, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond diaService.get(id)
    }

    def update(Dia dia) {
        if (dia == null) {
            notFound()
            return
        }

        try {
            diaService.save(dia)
        } catch (ValidationException e) {
            respond dia.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'dia.label', default: 'Dia'), dia.id])
                redirect dia
            }
            '*'{ respond dia, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        diaService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'dia.label', default: 'Dia'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'dia.label', default: 'Dia'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
