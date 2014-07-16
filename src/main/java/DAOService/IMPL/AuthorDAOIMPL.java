package DAOService.IMPL;

import DAO.AuthorEntity;
import DAOService.AuthorDAOService;
import Util.HibernateUtiltiy;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class AuthorDAOIMPL implements AuthorDAOService {

    @Override
    public AuthorEntity find(String firstName) {
        Session session = HibernateUtiltiy.getSession();

        session.beginTransaction();
        AuthorEntity person = (AuthorEntity) session.get(AuthorEntity.class, firstName);
        if (person == null) {
            return null;
        }
        session.close();

        return person;
    }

    @Override
    public StringBuilder findRoles() {

        Session session = HibernateUtiltiy.getSession();
        session.beginTransaction();
        Query query = session.createQuery("from AuthorEntity ");

        List<AuthorEntity> list = query.list();
        StringBuilder builder = new StringBuilder();

        list.stream().forEach((authors) -> {
            builder.append(authors.getFirstName() + authors.getTitle());
        });
        session.close();
        return builder;
    }

    @Override
    public void createPerson(AuthorEntity person) {
        Session session = HibernateUtiltiy.getSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        session.close();

    }
}
