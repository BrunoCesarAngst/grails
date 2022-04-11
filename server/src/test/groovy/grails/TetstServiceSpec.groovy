package grails

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class TetstServiceSpec extends Specification implements ServiceUnitTest<TetstService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
