package DAO_Service;

import DAO.Person_Entity;

/**
 * Created by Marion on 7/14/2014.
 */
public interface PersonService {
    public Person_Entity find(String firstName);
    public String findRoles();
    public void createPerson(Person_Entity person);
}
