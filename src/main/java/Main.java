import DAO.Person_Entity;
import DAO_Service.PersonIMPL;
import DAO_Service.PersonService;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.Map;


public class Main {


    public static void main(final String[] args) throws Exception {

        PersonService service = new PersonIMPL();
        Person_Entity entity = new Person_Entity();
        entity.setFirstName("Mike");
        entity.setLastName("Mork");
        entity.setRole("Administrator");

        service.createPerson(entity);


   entity =     service.find("Mike");

        System.out.println("Found: "+" "+entity.getFirstName()+" "+ entity.getRole());
    }
}
