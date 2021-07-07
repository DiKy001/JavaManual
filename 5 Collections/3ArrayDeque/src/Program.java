import java.util.ArrayDeque;

public class Program{

    public static void main(String[] args) {

        ArrayDeque<String> states = new ArrayDeque<String>();
        // addition of elements
        states.add("Germany");
        states.addFirst("France"); // add an element to the beginning
        states.push("Great Britain"); // add an element to the beginning
        states.addLast("Spain"); // add an element to the end
        states.add("Italy");

        // get the first element without deleting
        String sFirst = states.getFirst();
        System.out.println(sFirst);     // Great Britain
        // get the last element without deleting
        String sLast = states.getLast();
        System.out.println(sLast);      // Italy

        System.out.printf("Queue size: %d \n", states.size());  // 5

        // iteration over elements
        while(states.peek()!=null){
            // extraction from the beginning
            System.out.println(states.pop());
        }

        // a queue of Person objects
        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        // iteration over elements without extraction
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