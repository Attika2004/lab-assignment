public class Person {
    private String name;
    private int contactNumber;
    public Person(String name, int contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;

    }
    public String getName() {
        return name;
    }
    public int getContactNumber() {
        return contactNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
    public void diaplay(){
        System.out.println("Name : " + name);
        System.out.println("Contact Number : " + contactNumber);
    }
}
