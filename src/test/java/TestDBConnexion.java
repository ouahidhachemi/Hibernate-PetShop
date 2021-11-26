import entities.Cat;
import model.CatDAO;
import org.junit.jupiter.api.Test;

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

        CatDAO catDAO = new CatDAO();

        Cat cat = new Cat("Rikcy", 4, 'M', "Siamois");

        catDAO.createCatDAO(cat);
        //System.out.println(catDAO.showPet());

    }

}