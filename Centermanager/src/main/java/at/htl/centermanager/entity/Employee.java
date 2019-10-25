package at.htl.centermanager.entity;

import javax.persistence.*;


@Entity
@Table(name="EMPLOYEE")
@NamedQueries(
        @NamedQuery(
                name = "Employee.findAll",
                query = "select e from Employee e"
        )
)


public class Employee {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Employee() {

    }

    public Employee(String name) {


        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return id + " - " + name;
    }
 }

