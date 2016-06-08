package main.groovy.test

import org.springframework.web.client.RestTemplate

/**
 * Created by klevshin on 6/6/2016.
 */
class ClientFactoryRest {

    public OperatingStructure getRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        OperatingStructure operatingStructure = restTemplate.getForObject("http://localhost:8080/operating?operation=summing&value1=50&value2=100", OperatingStructure.class);

        return operatingStructure;
    }
}



