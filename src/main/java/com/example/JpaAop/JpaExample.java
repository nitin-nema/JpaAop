package com.example.JpaAop;

//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.Persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JpaExample {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");
        EntityManager em = emf.createEntityManager();

        // Begin transaction, persist entities
        em.getTransaction().begin(); // persit/update/delete -- atomic
        Customer customer = new Customer();
        customer.setName("John Doe");
        em.persist(customer);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
