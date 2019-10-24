package at.htl.centermanager.boundary;

import at.htl.centermanager.entity.Employee;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("/")
public class CenterManagerEndpoint {

    @PersistenceContext
    EntityManager em;

    @PostConstruct
    public void init() {
        System.out.println("****  CenterManagerEP created ***");
    }
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getLinie(@PathParam("id") Long id) {
        return em.find(Employee.class, id);

    }
}

