package DAO.IMPL;

import DAO.Author;
import DAO.AuthorDAO;
import Model.AuthorEntity;
import Util.HibernateUtiltiy;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;


public class AuthorDAOIMPL implements AuthorDAO {
    public int insertAuthor(Author author) {

        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setFirstName(author.getFirstName());
        authorEntity.setLastName(author.getLastName());
        authorEntity.setTitle(author.getRole());

        Session session = HibernateUtiltiy.getSession();
        Transaction tx = session.getTransaction();
        tx.begin();
        session.save(authorEntity);
        tx.commit();
        session.close();
        return 1;
    }

    public boolean deleteAuthor(Author author) {
        return false;
    }

    public Author findAuthor(String firstName) {
        Session session = HibernateUtiltiy.getSession();

        session.beginTransaction();
        AuthorEntity person = (AuthorEntity) session.get(AuthorEntity.class, firstName);
        if (person == null) {
            return null;
        }

        Author author = new Author();
        author.setFirstName(person.getFirstName());
        author.setLastName(person.getLastName());
        author.setRole(person.getTitle());
        session.close();

        return author;
    }

    public List<Author> getAuthors() {
        String q = "select * from authors ";
        Session session = HibernateUtiltiy.getSession();

        SQLQuery query = session.createSQLQuery(q);
        List<AuthorEntity> list = query.list();

        System.out.println(list);

        return null;
    }


}
