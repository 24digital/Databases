package DAOService;

import DAO.AuthorEntity;

/**
 * Created by Marion on 7/14/2014.
 */
public interface AuthorDAOService {
    public AuthorEntity find(String firstName);
    public String findRoles();
    public void createPerson(AuthorEntity person);
}
