package DAO;

import javax.persistence.*;


@Entity

@Table(name = "mo", schema = "Test")
public class AuthorEntity {
    private String firstName;
    private String lastName;
    private String title;

    @Column(name = "Role")
    public String getTitle() {
        return title;
    }

    public void setTitle(String role) {
        this.title = role;
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

        AuthorEntity authorEntity = (AuthorEntity) o;

        if (firstName != null ? !firstName.equals(authorEntity.firstName) : authorEntity.firstName != null)
            return false;
        if (lastName != null ? !lastName.equals(authorEntity.lastName) : authorEntity.lastName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}
