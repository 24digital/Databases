import DAO.AuthorEntity;
import DAOService.IMPL.AuthorDAOIMPL;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {


    public static void main(final String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        AuthorDAOIMPL author = (AuthorDAOIMPL) context.getBean("service");

        AuthorEntity entity = new AuthorEntity();
        entity.setFirstName("Mike");
        entity.setLastName("Mork");
        entity.setTitle("Administrator");

        author.createPerson(entity);


        entity.setFirstName("Russel");
        entity.setLastName("Webil");
        entity.setTitle("Administrator");

        author.createPerson(entity);


        entity.setFirstName("Marion");
        entity.setLastName("Morris");
        entity.setTitle("Administrator");

        author.createPerson(entity);

        AuthorEntity entity3 = author.find("Marion");

        System.out.println("Found: " + " " + entity3.getFirstName() + " " + entity3.getTitle());


        System.out.println("Found: " + " " + author.getList());
    }
}
