package hello;

/**
 * Created by klevshin on 5/11/2016.
 */

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest({"server.port=0"})


public class OperatingControllerIT {

    @Value("${local.server.port}")
    private int port;

    private URL base;
    private RestTemplate template;

    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/operating?operation=summing&value1=50&value2=100");
        template = new TestRestTemplate();
    }

    @Test
    public void getOperationName() {
        OperatingStructure operatingStructure = template.getForObject(base.toString(), OperatingStructure.class );


        assertThat(operatingStructure.getOperation(), equalTo("summing"));


    }

    @Test
    public void getOperationResult() {
        OperatingStructure operatingStructure = template.getForObject(base.toString(), OperatingStructure.class );


        assertThat(operatingStructure.getResult(), equalTo(150));


    }



}




































