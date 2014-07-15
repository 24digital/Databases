package DAOService.IMPL;

import DAO.PersonEntity;
import Util.HibernateUtiltiy;
import org.hibernate.Session;

public class PersonDAOService implements DAOService.PersonDAOService {
    @Override
    public PersonEntity find(String firstName) {
      Session session =  HibernateUtiltiy.getSession();

        session.beginTransaction();
        PersonEntity person =   (PersonEntity)    session.get(PersonEntity.class, firstName);
session.close();

     return person;
    }

    @Override
    public String findRoles() {
        return null;
    }

    @Override
    public void createPerson(PersonEntity person) {
        Session session = HibernateUtiltiy.getSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
 session.close();

    }
}
