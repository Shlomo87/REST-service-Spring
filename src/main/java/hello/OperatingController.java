package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by klevshin on 4/25/2016.
 */

@RestController
public class OperatingController {

    @RequestMapping("/operating")
    public Operating operating(@RequestParam( value = "operation") String operation, @RequestParam( value = "value1") int value1,
                               @RequestParam( value = "value2") int value2) {
        return new Operating(operation, value1, value2);
    }

    @RequestMapping("/sendingArticle")
    public DriveSubscriber sendingArticle(@RequestParam( value = "article") String article) {

        DrivePublisher publisher = new DrivePublisher();
        DriveSubscriber subscriber = new DriveSubscriber();
        publisher.subscribers.add(subscriber);

        publisher.sendArticle(article);


        return (subscriber);

    }

}



