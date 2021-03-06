package entities;

import classes.Pet;

import javax.persistence.*;

@Entity
public class Cat extends Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cat_id", updatable =false, nullable = false)
    private Long id;

    public Cat() {}

    public Cat(String name, int age, char sex, String breed) {
        super(name, age, sex, breed);
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cat{id=%d, name='%s', age=%d, sex=%s, breed='%s'}".formatted(id, super.name, super.age, super.sex, super.breed);
    }
}
