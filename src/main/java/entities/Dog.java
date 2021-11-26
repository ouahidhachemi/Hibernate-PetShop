package entities;

import classes.Pet;

import javax.persistence.*;

@Entity
public class Dog extends Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cat_id", updatable =false, nullable = false)
    private Long id;

    public Dog() {}

    public Dog(String name, int age, char sex, String breed) {
        super(name, age, sex, breed);
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Dog{id=%d, name='%s', age=%d, sex=%s, breed='%s'}".formatted(id, super.name, super.age, super.sex, super.breed);
    }
}
