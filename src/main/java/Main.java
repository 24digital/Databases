import DAO.PersonEntity;
import DAOService.IMPL.PersonDAOService;


public class Main {


    public static void main(final String[] args) throws Exception {

        PersonDAOService service = new DAOService.IMPL.PersonDAOService();
        PersonEntity entity = new PersonEntity();
        entity.setFirstName("Mike");
        entity.setLastName("Mork");
        entity.setRole("Administrator");

        service.createPerson(entity);


   entity =     service.find("Mike");

        System.out.println("Found: "+" "+entity.getFirstName()+" "+ entity.getRole());
    }
}
