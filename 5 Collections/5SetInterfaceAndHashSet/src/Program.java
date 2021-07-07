import java.util.HashSet;

public class Program{

    public static void main(String[] args) {

        HashSet<String> states = new HashSet<String>();

        // add a number of elements to the list
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        // trying to add an item that is already in the collection
        boolean isAdded = states.add("Germany");
        System.out.println(isAdded);    // false

        System.out.printf("Set contains %d elements \n", states.size());    // 3

        for(String state : states){

            System.out.println(state);
        }
        // removing an item
        states.remove("Germany");

        // hash table of Person objects
        HashSet<Person> people = new HashSet<Person>();
        people.add(new Person("Mike"));
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));
        for(Person p : people){

            System.out.println(p.getName());
        }
    }
}
class Person{

    private String name;
    public Person(String value){

        name=value;
    }
    String getName(){return name;}
}