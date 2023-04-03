
/*In this example, the Person class's constructor creates a new Address object by copying 
    the values of the original Address object's variables. This creates a new Address 
    object with its own memory address, so changes made to one Person object's Address 
    object will not be reflected in the other Person object's Address object.
 */

public class DeepCopyDemo {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Anytown");
        Person person1 = new Person("Alice", 30, address);
            // create a deep copy of person1
    Person person2 = new Person(person1.getName(), person1.getAge(), person1.getAddress());

    // change the address of person1
    person1.getAddress().setStreet("456 Broad St");

    System.out.println(person1); // prints "Person[name=Alice, age=30, address=Address[street=456 Broad St, city=Anytown]]"
    System.out.println(person2); // prints "Person[name=Alice, age=30, address=Address[street=123 Main St, city=Anytown]]" (note: the two objects have different addresses for the Address object)
    }
}
