import entities.Cat;
import entities.Dog;
import model.CatDAO;
import model.DogDAO;

public class Main {
    public static void main(String[] args) {
        CatDAO catDAO = new CatDAO();
        DogDAO dogDAO = new DogDAO();

        Cat cat = new Cat("Rikcy", 4, 'M', "Siamois");

        Dog dog = new Dog("Koucky", 5, 'M', "Caniche");

        catDAO.createCatDAO(cat);

        dogDAO.createDogDAO(dog);

        catDAO.showCat();

        dogDAO.showDog();
    }
}
