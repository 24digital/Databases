import DAO.AuthorEntity;
import DAOService.IMPL.AuthorDAOIMPL;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;


public class Main {


    public static void main(final String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        while (true)

        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("First Name:");
            String firstName = scanner.nextLine();
            AuthorEntity author = (AuthorEntity) context.getBean("author");

            AuthorEntity entity = new AuthorEntity();
            entity.setFirstName(firstName);

            System.out.println("Last Name:");

            String lastName = scanner.nextLine();
            entity.setLastName(lastName);
            entity.setTitle("Administrator");

            AuthorDAOIMPL authors = (AuthorDAOIMPL) context.getBean("service");
            authors.createPerson(entity);

            entity = authors.find(firstName);

            System.out.println("Found: " + " " + entity.getFirstName() + " " + entity.getTitle());
        }
    }
}
