package DAO;

import javax.persistence.*;

/**
 * Created by Marion on 7/14/2014.
 */
@Entity
@Table(name = "mo", schema = "", catalog = "test")
public class Person_Entity {
    private String firstName;
    private String lastName;
    private String role;

    @Column(name = "Role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Id
    @Column(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "lastName")
    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person_Entity personEntity = (Person_Entity) o;

        if (firstName != null ? !firstName.equals(personEntity.firstName) : personEntity.firstName != null)
            return false;
        if (lastName != null ? !lastName.equals(personEntity.lastName) : personEntity.lastName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}
