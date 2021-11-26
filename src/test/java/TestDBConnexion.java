import entities.Cat;
import model.PetDAO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestDBConnexion {
/**
    @BeforeAll
    void createCat(){
        Cat cat = new Cat("Chat", 6, 'M', "Félin");
    }
*/
    @Test
    void connect() {
        /**
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("connect");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
         */

        PetDAO catDAO = new PetDAO();

        Cat cat = new Cat("Rikcy", 4, 'M', "Siamois");

        catDAO.createPetDAO(cat);

        System.out.println(catDAO.showPet(2L));

    }

}