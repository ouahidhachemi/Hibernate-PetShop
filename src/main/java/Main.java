import entities.Cat;
import model.PetDAO;

public class Main {
    public static void main(String[] args) {
        PetDAO catDAO = new PetDAO();

        Cat cat = new Cat("Rikcy", 4, 'M', "Siamois");

        catDAO.createPetDAO(cat);
    }
}
