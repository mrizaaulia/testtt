package com.mycompany.rizaps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class SpringDAO {

    private final SessionFactory sessionFactory;

    public SpringDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public boolean cekLogin(String username, String password) {

        try (Session session = sessionFactory.openSession()) {

            Login user = session.createQuery(
                "FROM Login WHERE username = :username AND password = :password",
                Login.class
            )
            .setParameter("username", username)
            .setParameter("password", password)
            .uniqueResult();

            return user != null;
        }
    }
}