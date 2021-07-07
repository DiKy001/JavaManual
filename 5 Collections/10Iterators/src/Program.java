import java.util.*;

public class Program {
    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        Iterator<String> iter = states.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        ListIterator<String> listIter = states.listIterator();

        while(listIter.hasNext()){
            System.out.println(listIter.next());
        }
        // now the current item is Spain
        // change the value of this element
        listIter.set("Португалия");
        // go through the elements in reverse order
        while(listIter.hasPrevious()){
            System.out.println(listIter.previous());
        }
    }
}
