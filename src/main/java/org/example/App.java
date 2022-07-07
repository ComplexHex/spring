package org.example;
//
//import org.example.model.Person;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
///**
// * Hello world!
// */
//public class App {
//    public static void main(String[] args) {
//
//        //по умолчанию читается файл hibernate.properties
//        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//
//        try {
//            session.beginTransaction();
//            Person person = session.get(Person.class, 1);
//            System.out.println(person.getName());
//            System.out.println(person.getAge());
//
//
//            session.getTransaction().commit();
//
//
//        } finally {
//            sessionFactory.close();
//        }
//    }
//}


import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
//обращение к сущности Person
//            List<Person> list = session.createQuery("From Person where age > 30").getResultList();
//            List<Person> list1 = session.createQuery("From Person where name like 'T%'").getResultList();
           session.createQuery("update Person set name='TEES' where age = 54").executeUpdate();
//            for (Person p : list) {
//                System.out.println(p);
//            }
//            for (Person p : list1) {
//                System.out.println(p);
//            }

            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }
    }
}
