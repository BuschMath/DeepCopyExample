public class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // getters and setters omitted for brevity
    String getCity() {return city;}
    String getStreet() {return street;}
    void setStreet(String a_Street) {street = a_Street;}
}
