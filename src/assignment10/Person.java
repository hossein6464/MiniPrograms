package assignment10;

import java.util.ArrayList;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<Addresses> addresses = new ArrayList<>();

    public Person(int id, String firstName, String lastName, ArrayList<Addresses> addresses) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addresses = addresses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public ArrayList<Addresses> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Addresses> addresses) {
        this.addresses = addresses;
    }
}
