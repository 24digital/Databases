package DAOService;

import DAO.PersonEntity;

/**
 * Created by Marion on 7/14/2014.
 */
public interface PersonDAOService {
    public PersonEntity find(String firstName);
    public String findRoles();
    public void createPerson(PersonEntity person);
}
