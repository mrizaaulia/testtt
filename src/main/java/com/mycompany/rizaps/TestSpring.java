package com.mycompany.rizaps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class)) {

            SpringDAO dao = context.getBean(SpringDAO.class);

            System.out.println("SpringDAO berhasil dibuat!");
        }
    }
}