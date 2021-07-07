import java.util.LinkedList;

public class Program{

    public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<String>();

        // add a number of elements to the list
        states.add("Germany");
        states.add("France");
        states.addLast("Great Britain"); // add in last place
        states.addFirst("Spain"); // add to the first place
        states.add(1, "Italy"); // add item at index 1

        System.out.printf("List has %d elements \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Portugal");
        for(String state : states){

            System.out.println(state);
        }
        // checking for the presence of an element in the list
        if(states.contains("Germany")){

            System.out.println("List contains Germany");
        }

        states.remove("Germany");
        states.removeFirst(); // removing the first element
        states.removeLast(); // removing the last element

        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        people.remove(1); // removing the second element

        for(Person p : people){

            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName()); // the output of the first item
    }
}
class Person{

    private String name;
    public Person(String value){

        name=value;
    }
    String getName(){return name;}
}