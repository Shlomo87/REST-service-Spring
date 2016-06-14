package main.groovy.test

/**
 * Created by klevshin on 6/8/2016.
 */

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration



import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.ContextHierarchy;

import spock.lang.*

@ContextConfiguration( value = "/main/groovy/resources/client-service-context.xml")
class HelloSpock3 extends Specification{


    @Autowired
    ClientFactoryRest serviceClient

    def "Check result"() {
        expect:
        serviceClient.getRestTemplate().getResult().equals(150);

    }

    def "Check operation name"() {
        expect:
        serviceClient.getRestTemplate().getOperation().equals("summing");

    }







}
