package org.example;

import org.example.model.Item;
import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().
                addAnnotatedClass(Person.class).addAnnotatedClass(Item.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

//            Person person = session.get(Person.class, 3);
//            System.out.println(person);
//            List<Item> items = person.getItems();
//            System.out.println(items);
//
//            Item item = session.get(Item.class, 2);
//            System.out.println(item);
//            Person person = item.getOwner();
//            System.out.println(person);

//            Person person = session.get(Person.class, 2);
//            Item newItem = new Item("Item from Hibernate", person);
////для создания двустороннего отношения между таблицами в кзше hibernate
//            person.getItems().add(newItem);
//            session.save(newItem);

            //добавление человека и товара
//            Person person = new Person("Basil", 33);
//            Item item = new Item("Uzi", person);
//            person.setItems(new ArrayList<Item>(Collections.singletonList(item)));
//            session.save(person);
//            session.save(item);

            //удаление у человека всех товаров
//            Person person = session.get(Person.class, 2);
//            List<Item> items = person.getItems();
            //SQL
//            for (Item i:items){
//                session.remove(i);
//            }
            //для создания двустороннего отношения между таблицами в кзше hibernate
//            person.getItems().clear();

            //удаление человека
//            Person person = session.get(Person.class, 1);
//            session.delete(person);
            //SQL
//            session.remove(person);
            //для создания двустороннего отношения между таблицами в кзше hibernate
//            person.getItems().forEach(i->i.setOwner(null));

            //замена товара
            Person person = session.get(Person.class, 3);
            Item item = session.get(Item.class, 1);

            item.getOwner().getItems().remove(item);

            //SQL
            item.setOwner(person);

            person.getItems().add(item);


            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }
    }
}
