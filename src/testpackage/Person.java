package testpackage;

public class Person {
    private String firstNameObject;
    private String familyName;
    private int age;
    public  static int newName;
    static int number;
    private String address;
    public Person() {
    }

    public Person(String firstName, String familyName, int age, String address) {
        firstNameObject = firstName;
        this.familyName = familyName;
        this.age = age;
        this.address = address;
    }

    static void setK (int newName) {
        Person.newName = newName;
    }

    public String getFirstName() {
        return firstNameObject;
    }

    public void setFirstName(String firstName) {
        this.firstNameObject = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstNameObject + '\'' +
                ", familyName='" + familyName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

}
