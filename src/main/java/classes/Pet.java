package classes;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pet {

    protected String name;
    protected int age;
    protected char sex;
    protected String breed;


    public Pet() {
    }

    public Pet(String name, int age, char sex, String breed) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.breed = breed;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Pet{name='%s', age=%d, breed='%s'}".formatted(name, age, breed);
    }
}
