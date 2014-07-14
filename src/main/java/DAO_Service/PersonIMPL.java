package DAO_Service;

import DAO.Person_Entity;
import Util.HibernateSession;
import org.hibernate.Session;

public class PersonIMPL implements PersonService {
    @Override
    public Person_Entity find(String firstName) {
      Session session =  HibernateSession.getSession();

        session.beginTransaction();
        Person_Entity person =   (Person_Entity)    session.get(Person_Entity.class, firstName);
session.close();

     return person;
    }

    @Override
    public String findRoles() {
        return null;
    }

    @Override
    public void createPerson(Person_Entity person) {
        Session session = HibernateSession.getSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
 session.close();

    }
}
