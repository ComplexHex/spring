package org.example;

import org.example.model.Passport;
import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().
                addAnnotatedClass(Person.class).addAnnotatedClass(Passport.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

//            Person person = new Person("Test person", 32);
//            Passport passport = new Passport( 1232456);
//            person.setPassport(passport);
//            session.save(person);

            Person person = session.get(Person.class,1);
            System.out.println(person.getPassport().getPassportNumber());


            Passport passport = session.get(Passport.class,1);
            System.out.println(passport.getPassportNumber());
            System.out.println(passport.getPerson());

            Person person1 = session.get(Person.class, 1);
          person1.getPassport().setPassportNumber(15235);

            session.save(person1);




            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }
    }
}
