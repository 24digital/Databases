package DAOService.IMPL;

import DAO.AuthorEntity;
import DAOService.AuthorDAOService;
import Util.HibernateUtiltiy;
import org.hibernate.Session;

public class AuthorDAOIMPL implements AuthorDAOService {

    public AuthorEntity find(String firstName) {
      Session session =  HibernateUtiltiy.getSession();

        session.beginTransaction();
        AuthorEntity person =   (AuthorEntity)    session.get(AuthorEntity.class, firstName);
        if (person == null) {
            return null;
        }
session.close();

     return person;
    }


    public String findRoles() {

        Session session = HibernateUtiltiy.getSession();
        session.beginTransaction();

        return null;
    }


    public void createPerson(AuthorEntity person) {
        Session session = HibernateUtiltiy.getSession();
        session.beginTransaction();
        session.save(person);
//        session.getTransaction().commit();
 session.close();

    }
}
