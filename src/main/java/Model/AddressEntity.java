package Model;

import javax.persistence.Entity;

@Entity
public class AddressEntity {
 private   String street;
   private int streetNumber;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
