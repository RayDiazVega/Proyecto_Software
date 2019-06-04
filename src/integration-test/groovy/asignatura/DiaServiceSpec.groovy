package asignatura

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class DiaServiceSpec extends Specification {

    DiaService diaService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Dia(...).save(flush: true, failOnError: true)
        //new Dia(...).save(flush: true, failOnError: true)
        //Dia dia = new Dia(...).save(flush: true, failOnError: true)
        //new Dia(...).save(flush: true, failOnError: true)
        //new Dia(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //dia.id
    }

    void "test get"() {
        setupData()

        expect:
        diaService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Dia> diaList = diaService.list(max: 2, offset: 2)

        then:
        diaList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        diaService.count() == 5
    }

    void "test delete"() {
        Long diaId = setupData()

        expect:
        diaService.count() == 5

        when:
        diaService.delete(diaId)
        sessionFactory.currentSession.flush()

        then:
        diaService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Dia dia = new Dia()
        diaService.save(dia)

        then:
        dia.id != null
    }
}
