package model;

import entities.Cat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CatDAO {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("connect");

    public void createCatDAO(Cat entity) {

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

    public Cat findCat(Long id) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager.find(Cat.class, id);

    }

    public void deleteCat(Long id) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
        entityManager.remove(findCat(id));
        entityTransaction.commit();

    }

    public void showCat() {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Long id = 1L;

        Cat entity = entityManager.find(Cat.class, id);

        while (entity != null) {
            System.out.printf("Id #%d\t%s%n", entity.getId(), entity.getName());
            entity = entityManager.find(Cat.class, ++id);
        }



    }

}
