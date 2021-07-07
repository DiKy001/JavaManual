import java.util.TreeSet;
import java.util.*;

public class Program{

    public static void main(String[] args) {

        TreeSet<String> states = new TreeSet<String>();

        // add a number of elements to the list
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Great Britain");

        System.out.printf("TreeSet contains %d elements \n", states.size());

        // removing an item
        states.remove("Germany");
        for(String state : states){

            System.out.println(state);
        }

        TreeSet<String> states1 = new TreeSet<String>();

        // add a number of elements to the list
        states1.add("Germany");
        states1.add("France");
        states1.add("Italy");
        states1.add("Spain");
        states1.add("Great Britain");

        System.out.println(states1.first()); // we get the first - the smallest element
        System.out.println(states1.last()); // get the last - largest element
        // get a subset from one element to another
        SortedSet<String> set = states1.subSet("Germany", "Italy");
        System.out.println(set);
        // an element from the set that is greater than the current one
        String greater = states1.higher("Germany");
        // an element from the set that is less than the current one
        String lower = states1.lower("Germany");
        // return the set in reverse order
        NavigableSet<String> navSet = states1.descendingSet();
        // return a set in which all elements are less than the current one
        SortedSet<String> setLower=states1.headSet("Germany");
        // return a set in which all elements are greater than the current one
        SortedSet<String> setGreater=states1.tailSet("Germany");
        System.out.println(navSet);
        System.out.println(setLower);
        System.out.println(setGreater);
    }
}