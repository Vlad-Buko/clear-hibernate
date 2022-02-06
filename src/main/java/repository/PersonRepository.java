package repository;

import models.Motorcycles;
import models.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class PersonRepository {

    public Person findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Person.class, id);
    }

    public void save(Person person) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(person);
        tx1.commit();
        session.close();
    }

    public void delete(Person person) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(person);
        tx1.commit();
        session.close();
    }

    public void update(Person person) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(person);
        tx1.commit();
        session.close();
    }

    public Motorcycles findMotoById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Motorcycles.class, id);
    }

    public List<Person> findAll() {
        List <Person> byPerson = (List<Person>) HibernateSessionFactoryUtil.getSessionFactory()
                .openSession().createQuery("From models.Person").list();
        return byPerson;
    }

}
