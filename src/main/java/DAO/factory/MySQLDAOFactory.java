package dao.factory;

import dao.AuthorDAO;
import dao.impl.AuthorDAOIMPL;


public class MySQLDAOFactory extends DAOFactory {
    @Override
    public AuthorDAO getAuthorDAO() {
        return new AuthorDAOIMPL();
    }
}
