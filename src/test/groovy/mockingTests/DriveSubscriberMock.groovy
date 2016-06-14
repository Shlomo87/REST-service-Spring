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

@ContextConfiguration( value = "/test/resources/publisher-subscriber-context.xml")
class DriveSubscriberMock extends Specification {

    @Autowired
    DrivePublisher drivePublisher

    @Autowired
    DriveSubscriber driveSubscriber





    def "MockingTest"() {

        drivePublisher.subscribers

        String s = "Infiniti"

        expect:
        s.equals("Infiniti")

    }


}
