package dao.factory;


import dao.AuthorDAO;

public abstract class DAOFactory {
    //DAOs supported by the factory
    public static final int MYSQL = 1;

    public static DAOFactory getDAOFactory(int factory) {
        switch (factory) {
            case MYSQL:
                return new MySQLDAOFactory();
            default:
                return null;
        }
    }

    //Concrete dao
    public abstract AuthorDAO getAuthorDAO();
}
