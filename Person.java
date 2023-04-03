public class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address.getStreet(), address.getCity());
    }

    // getters and setters omitted for brevity
    Address getAddress() {return address;}
    String getName() {return name;}
    int getAge() {return age;}
}