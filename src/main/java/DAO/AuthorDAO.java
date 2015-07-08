package DAO;

import java.util.List;

/**
 * Created by Marion on 7/8/2015.
 */
public interface AuthorDAO {
    public int insertAuthor(Author author);

    public boolean deleteAuthor();

    public Author findAuthor(String firstName);

    public List getAuthors();

}
