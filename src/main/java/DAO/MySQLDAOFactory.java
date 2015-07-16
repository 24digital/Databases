package DAO;

import DAO.IMPL.AuthorDAOIMPL;


public class MySQLDAOFactory extends DAOFactory {
    @Override
    public AuthorDAO getAuthorDAO() {
        return new AuthorDAOIMPL();
    }
}
