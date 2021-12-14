package assignment10;

import java.util.ArrayList;

public class DataCollection {

    private ArrayList<Person> personArrayList;

    public DataCollection(ArrayList<Person> person) {
        this.personArrayList = person;
    }

    public DataCollection() {
    }

    public ArrayList<Person> getPersonArrayList() {
        return personArrayList;
    }

    public void setPersonArrayList(ArrayList<Person> personArrayList) {
        this.personArrayList = personArrayList;
    }
}
