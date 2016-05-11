package hello;

/**
 * Created by klevshin on 4/26/2016.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumeApplication {
    private static final Logger log = LoggerFactory.getLogger(ConsumeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsumeApplication.class);

        RestTemplate restTemplate = new RestTemplate();

        OperatingStructure operatingStructure = restTemplate.getForObject("http://localhost:8080/operating?operation=summing&value1=50&value2=100", OperatingStructure.class);

        System.out.print("Logging service response: " + operatingStructure.getOperation() + " " + operatingStructure.getResult() + " ");
    }



}

