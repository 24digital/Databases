package DAO;


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

    //Concrete DAO
    public abstract AuthorDAO getAuthorDAO();
}
