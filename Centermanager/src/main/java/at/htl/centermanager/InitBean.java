package at.htl.centermanager;

import at.htl.centermanager.entity.Employee;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class InitBean {

    @PersistenceContext
    EntityManager em;

    public void init(@Observes @Initialized(ApplicationScoped.class) Object init) {
        System.out.println("*** It works :-) ***");


        em.persist(new Employee(1,"Schickmair"));
        em.persist(new Employee(2,"Mair"));
    }
}
