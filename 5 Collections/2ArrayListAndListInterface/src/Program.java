import java.util.ArrayList;

public class Program{

    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<String>();
        // add a number of elements to the list
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob"); // add item at index 1

        System.out.println(people.get(1));// get the 2nd object
        people.set(1, "Robert"); // setting a new value for the 2nd object

        System.out.printf("ArrayList has %d elements \n", people.size());
        for(String person : people){

            System.out.println(person);
        }
        // check for the presence of an element
        if(people.contains("Tom")){

            System.out.println("ArrayList contains Tom");
        }

        // remove some objects
        // remove a specific item
        people.remove("Robert");
        // remove by index
        people.remove(0);

        Object[] peopleArray = people.toArray();
        for(Object person : peopleArray){

            System.out.println(person);
        }
    }
}