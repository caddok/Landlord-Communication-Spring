package com.evtimov.landlordapp.landlordspring;

import com.evtimov.landlordapp.landlordspring.models.*;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LandlordspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(LandlordspringApplication.class, args);
    }

//    @Bean
//    public SessionFactory sessionFactory(){
//        return new org.hibernate.cfg.Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(User.class)
//                .addAnnotatedClass(Place.class)
//                .addAnnotatedClass(Card.class)
//                .addAnnotatedClass(Report.class)
//                .addAnnotatedClass(Payment.class)
//                .addAnnotatedClass(Rent.class)
//                .addAnnotatedClass(Chatsession.class)
//                .addAnnotatedClass(Message.class)
//                .buildSessionFactory();
//    }
}
