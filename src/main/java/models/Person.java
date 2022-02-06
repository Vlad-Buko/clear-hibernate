package models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Motorcycles> motorcycles;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        motorcycles = new ArrayList<>();
    }

    public void addMoto(Motorcycles motor) {
        motor.setPerson(this);
        motorcycles.add(motor);
    }
    public void removeMoto(Motorcycles motor) {
        motorcycles.remove(motor);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setMotorcycles(List<Motorcycles> motor) {
        this.motorcycles = motor;
    }

    @Override
    public String toString() {
        return "models.User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                "}";
    }
}
