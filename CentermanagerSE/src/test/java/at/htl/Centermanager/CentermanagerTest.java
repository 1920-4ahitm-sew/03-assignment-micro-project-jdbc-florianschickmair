package at.htl.Centermanager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class CentermanagerTest {


    static EntityManager em;

    @BeforeAll
    private static void init() {
        em = Persistence
                .createEntityManagerFactory("myPU")
                .createEntityManager();

    }

    @Test
    void test01DatabaseConnection() {
        System.out.println("IT WORKS!");
        Employee outboundFlight = new Flight("LNZ", "LAX", "25.10.2019");
        Flight returnFlight = new Flight("LAX", "LNZ", "29.10.2019");

        em.getTransaction().begin();
        em.persist(outboundFlight);
        em.persist(returnFlight);
        returnFlight.setDate("5.11.2019");
        em.getTransaction().commit();
    }

//    @Test
//    void test02readOneFlight() {
//        Flight outboundFlight = em.find(Flight.class,1L);
//        assertThat(outboundFlight.getDeparture(),is("LNZ"));
//        assertThat(outboundFlight.getDestination(),is("LAX"));
//    }

}