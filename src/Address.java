public class Address {
    private String city;
    private String street;
    private String postalCode;

    Address(String city, String street, String postalCode) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }
    public String getCity() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public String getPostalCode() {
        return postalCode;

    }

    public void setCity(String city) {

        this.city = city;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;

    }
    public void display(){
        System.out.println("City:"+city);
        System.out.println("Street:"+street);
        System.out.println("Postal Code:"+postalCode);

    }
}
