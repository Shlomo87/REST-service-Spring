package main.groovy.test

/**
 * Created by klevshin on 6/13/2016.
 */

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration



import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.ContextHierarchy;

import spock.lang.*

@ContextConfiguration( value = "/main/groovy/resources/client-service-context.xml")
class SendingArticleTests extends Specification {

    @Autowired
    SendingArticleTemplate sendingArticleTemplate

    def "Check sending article"() {
        expect:
        sendingArticleTemplate.getRestTemplate().getArticle().equals("LexusGS350")

    }



}



