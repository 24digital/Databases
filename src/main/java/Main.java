import DAO.AuthorEntity;
import DAOService.IMPL.AuthorDAOIMPL;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {


    public static void main(final String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        AuthorEntity entity = new AuthorEntity();
        entity.setFirstName("Mike");
        entity.setLastName("Mork");
        entity.setTitle("Administrator");

AuthorDAOIMPL author = (AuthorDAOIMPL)       context.getBean("service");
author.createPerson(entity);

   entity =     author.find("Mike");

        System.out.println("Found: "+" "+entity.getFirstName()+" "+ entity.getTitle());
    }
}
