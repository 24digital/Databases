import DAO.Author;
import DAO.AuthorDAO;
import DAO.DAOFactory;

import java.util.List;
import java.util.Scanner;


public class Main {


    public static void main(final String[] args) throws Exception {

        //   ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");


            Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to print out list\n Press 2 to insert name");
        if (scanner.nextInt() == 2) {
            userInsert();
            return;
        }
        DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        AuthorDAO auth = factory.getAuthorDAO();

        List<Author> authorList = auth.getAuthors();
        System.out.println(authorList);
    }

    public static void userInsert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Name:");
        String firstName = scanner.nextLine();

        DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        AuthorDAO auth = factory.getAuthorDAO();


        Author author = new Author();
        author.setFirstName(firstName);

        System.out.println("Last Name:");

        String lastName = scanner.nextLine();
        author.setLastName(lastName);

        System.out.println("Role");
        String role = scanner.nextLine();
        author.setRole(role);

        auth.insertAuthor(author);

    }
}
