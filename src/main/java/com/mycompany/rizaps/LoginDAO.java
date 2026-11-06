/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rizaps;

/**
 *
 * @author ASUS
 */

import org.hibernate.Session;

public class LoginDAO {

    public boolean cekLogin(String username, String password) {

        try (Session session =
                HibernateUtil.getSessionFactory().openSession()) {

            Login user = session.createQuery(
                    "FROM Login WHERE username = :username AND password = :password",
                    Login.class
            )
            .setParameter("username", username)
            .setParameter("password", password)
            .uniqueResult();

            return user != null;

        } catch (Exception e) {

            e.printStackTrace();

            throw new RuntimeException(
                    "Gagal melakukan proses login Hibernate: "
                    + e.getMessage(), e
            );
        }
    }
}
