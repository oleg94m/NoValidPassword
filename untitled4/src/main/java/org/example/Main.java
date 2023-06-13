package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
       Client client = new Client();
       client.setFirstName("dol323eg");
       client.setLastName("df2323sd");
       client.setPhoneNumber("2342134234");
       client.setEmail("dsf@sds.df");



        SessionFactory factory = new Configuration()
                .configure("cfg.xml")
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();
        session.save(client);
        session.getTransaction().commit();
        session.close();
    }

}