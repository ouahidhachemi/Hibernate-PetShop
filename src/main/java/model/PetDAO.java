package model;

import entities.Cat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PetDAO {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("connect");

    public void createPetDAO(Cat cat) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        if (cat.getId() == null) {
            entityManager.persist(cat);
        } else {
            entityManager.merge(cat);
        }

        entityTransaction.commit();

    }

    public void afficherPetDAO() {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

    }

}
