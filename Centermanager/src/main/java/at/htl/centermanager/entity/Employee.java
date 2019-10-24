package at.htl.centermanager.entity;

import javax.persistence.*;


@Entity
@NamedQueries(
        @NamedQuery(
                name = "Employee.findAll",
                query = "select e from Employee e"
        )
)


public class Employee {


    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public Employee() {

    }

    public Employee(int id, String name) {

        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return id + " - " + name;
    }
 }

