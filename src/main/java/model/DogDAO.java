package model;

import entities.Dog;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DogDAO {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("connect");

    public void createDogDAO(Dog entity) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        if (entity.getId() == null) {
            entityManager.persist(entity);
        } else {
            entityManager.merge(entity);
        }

        entityTransaction.commit();

    }

    public Dog findDog(Long id) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager.find(Dog.class, id);

    }

    public void deleteDog(Long id) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
        entityManager.remove(findDog(id));
        entityTransaction.commit();

    }

    public void showDog() {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Long id = 1L;

        Dog entity = entityManager.find(Dog.class, id);

        while (entity != null) {
            System.out.printf("Id #%d\t%s%n", entity.getId(), entity.getName());
            entity = entityManager.find(Dog.class, ++id);
        }



    }

}
