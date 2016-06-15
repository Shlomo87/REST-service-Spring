package mockingTests

import hello.DrivePublisher
import hello.DriveSubscriber

/**
 * Created by klevshin on 6/14/2016.
 */

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration



import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.ContextHierarchy;

import spock.lang.*

class DriveSubscriberMock extends Specification {

    DriveSubscriber driveSubscriber1 = Mock();
    DriveSubscriber driveSubscriber2 = Mock();
    DrivePublisher drivePublisher = new DrivePublisher();
    String article = "Infiniti";

    def setup() {

        drivePublisher.subscribers.add(driveSubscriber1);
        drivePublisher.subscribers.add(driveSubscriber2);

    }

    def "MockingTest1"() {

        when:

        drivePublisher.sendArticle(article);

        then:
        1 * driveSubscriber1.receiveArticle(article);
        1 * driveSubscriber2.receiveArticle(article);


    }

    def "MockingTest2"() {

        when:

        drivePublisher.sendArticle(article);

        then:
        2 * _.receiveArticle(article);

    }




}

























