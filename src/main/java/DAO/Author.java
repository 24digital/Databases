package DAO;

import java.io.Serializable;

/**
 * Created by Marion on 7/8/2015.
 */
public class Author implements Serializable {
    String firstName;
    String lastName;
    String role;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
