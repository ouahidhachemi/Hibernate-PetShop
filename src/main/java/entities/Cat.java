package entities;

import classes.Pet;

import javax.persistence.*;

@Entity
public class Cat extends Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cat_id", nullable = false)
    private Long id;

    private String name;
    private int age;
    private char sex;
    private String breed;

    public Cat() {}

    public Cat(String name, int age, char sex, String breed) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.breed = breed;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{id=%d, name='%s', age=%d, sex=%s, breed='%s'}".formatted(id, name, age, sex, breed);
    }
}
