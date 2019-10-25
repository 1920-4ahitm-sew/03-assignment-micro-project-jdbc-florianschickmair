package at.htl.Centermanager;

import at.htl.centermanager.entity.Employee;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


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
        Employee emp1 = new Employee(1,"name");


        em.getTransaction().begin();
        em.persist(emp1);
        em.getTransaction().commit();
    }


}