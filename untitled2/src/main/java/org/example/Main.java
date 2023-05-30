package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Animal1 animal1= new Animal1();
        animal1.setAge(56);
        animal1.setName("keрot");
        animal1.setTail(true);


        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();
        session.save(animal1);
        session.getTransaction().commit();
        session.close();

    }
}