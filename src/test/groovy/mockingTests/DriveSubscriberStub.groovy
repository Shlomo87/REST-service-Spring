package mockingTests

/**
 * Created by klevshin on 6/15/2016.
 */

import hello.DrivePublisher
import hello.DriveSubscriber

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.ContextHierarchy;

import spock.lang.*

class DriveSubscriberStub extends Specification {

    DriveSubscriber driveSubscriber1 = new DriveSubscriber();
    DrivePublisher drivePublisher = new DrivePublisher();
    String article = "Lexus";

    def setup() {
        drivePublisher.subscribers.add(driveSubscriber1);
        driveSubscriber1.receiveArticle(article) >> true;



    }

    def "StubbingTest1"() {

        when:
        drivePublisher.sendArticle(article);

        then:
        drivePublisher.SendingResult.equals("Lexus ok");
        1 * driveSubscriber1.receiveArticle(_);




    }


}





















