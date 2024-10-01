package com.example.JpaAop;

EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");
EntityManager em = emf.createEntityManager();
em.getTransaction().begin();
Customer customer = new Customer();
customer.setName("John Doe");
em.persist(customer);
em.getTransaction().commit();
