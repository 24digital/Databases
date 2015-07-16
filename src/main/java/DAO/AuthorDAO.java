package DAO;

import java.util.List;
public interface AuthorDAO {
    public int insertAuthor(Author author);

    public boolean deleteAuthor(Author author);

    public Author findAuthor(String firstName);

    public List getAuthors();

}
