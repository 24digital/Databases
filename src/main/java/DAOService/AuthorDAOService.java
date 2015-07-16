package DAOService;

import Model.AuthorEntity;


public interface AuthorDAOService {
    public AuthorEntity find(String firstName);

    public StringBuilder getList();
    public StringBuilder findRoles();
    public void createPerson(AuthorEntity person);
}
