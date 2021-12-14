package assignment10;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        Addresses address1 = new Addresses("Canada", "Montreal", "Jacques");
        Addresses address2 = new Addresses("Iran", "Tehran","Oghaz");
        Addresses address3 = new Addresses( "Canada", "Toronto","Flower");
        Addresses address4 = new Addresses("Can", "real", "Jac");

        ArrayList<Addresses> arrayAddresses1 = new ArrayList<Addresses>();
        arrayAddresses1.add(address1);
        arrayAddresses1.add(address2);
        arrayAddresses1.add(address3);

        ArrayList<Addresses> addresses2 = new ArrayList<Addresses>();
        addresses2.add(address4);
        addresses2.add(new Addresses("Irn", "ran","az"));
        addresses2.add(new Addresses( "ada", "onto","wer"));

        Person person1 = new Person(1,"John", "New",arrayAddresses1);
        Person person2 = new Person(2,"Ash", "Nice",arrayAddresses1);

        ArrayList<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(person1);
        personArrayList.add(person2);

        DataCollection dataCollection = new DataCollection(personArrayList);

        System.out.println(dataCollection.getPersonArrayList().get(1).getAddresses().get(1).getCountry());
        dataCollection.getPersonArrayList().get(1).getAddresses().get(1).setCountry("LA");
        System.out.println(dataCollection.getPersonArrayList().get(1).getAddresses().get(1).getCountry());
    }
}
