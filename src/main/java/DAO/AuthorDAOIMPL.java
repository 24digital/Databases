package DAO;

import Util.HibernateUtiltiy;
import org.hibernate.Session;

import java.util.List;


public class AuthorDAOIMPL implements AuthorDAO {
    public int insertAuthor(Author author) {

        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setFirstName(author.getFirstName());
        authorEntity.setLastName(author.getLastName());
        authorEntity.setTitle(author.getRole());

        Session session = HibernateUtiltiy.getSession();
        session.beginTransaction();
        session.save(authorEntity);
        session.getTransaction().commit();
        session.close();
        return 1;
    }

    public boolean deleteAuthor() {
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

    public List getAuthors() {
        return null;
    }


}
