package at.htl.Centermanager;

import org.junit.jupiter.api.BeforeEach;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class CentermanagerTest {

    private Client client;
    private WebTarget target;

    @BeforeEach

    public void initClient(){
        this.client = ClientBuilder.newClient();
        this.target = client.target("https://localhost:8080/centermanager/api/");
    }

}
