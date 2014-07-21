package Util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtiltiy {
    private static final SessionFactory ourSessionFactory;
    private static final ServiceRegistry serviceRegistry;

    /**
     * Configuration of Hibernate
     */
    static {
        try {
            Configuration configuration = new Configuration().configure();


            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    /**
     * A Hibernate Session for applying configuration settings.
     * @return Session
     * @throws HibernateException
     */
    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }
}
