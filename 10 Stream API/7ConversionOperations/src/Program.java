import java.util.Optional;
import java.util.*;
public class Program {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));
        System.out.println(names.stream().count());  // 4

        // the number of elements with a length of no more than 3 characters
        System.out.println(names.stream().filter(n->n.length()<=3).count());  // 3

        ArrayList<String> names1 = new ArrayList<String>();
        names1.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));

        Optional<String> first = names1.stream().findFirst();
        System.out.println(first.get());    // Tom

        Optional<String> any = names1.stream().findAny();
        System.out.println(first.get());    // Tom

        ArrayList<String> names2 = new ArrayList<String>();
        names2.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));

        // is there a string in the stream that is longer than 3
        boolean any1 = names2.stream().anyMatch(s->s.length()>3);
        System.out.println(any1);    // true

        // are all strings 3 characters long
        boolean all = names2.stream().allMatch(s->s.length()==3);
        System.out.println(all);    // false

        // IS NOT in the stream of the string "Bill". If not, then true, if there is, then false
        boolean none = names2.stream().noneMatch(s->s=="Bill");
        System.out.println(none);   // true

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));

        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println(min.get());  // 1
        System.out.println(max.get());  // 9

        ArrayList<Phone> phones = new ArrayList<Phone>();
        phones.addAll(Arrays.asList(new Phone("iPhone 8", 52000),
                new Phone("Nokia 9", 35000),
                new Phone("Samsung Galaxy S9", 48000),
                new Phone("HTC U12", 36000)));

        Phone min1 = phones.stream().min(Phone::compare).get();
        Phone max1 = phones.stream().max(Phone::compare).get();
        System.out.printf("MIN Name: %s Price: %d \n", min1.getName(), min1.getPrice());
        System.out.printf("MAX Name: %s Price: %d \n", max1.getName(), max1.getPrice());
    }
}
class Phone{

    private String name;
    private int price;

    public Phone(String name, int price){
        this.name=name;
        this.price=price;
    }
    public static int compare (Phone p1, Phone p2){
        if(p1.getPrice() > p2.getPrice())
            return 1;
        return -1;
    }
    public String getName() { return name; }
    public int getPrice() { return price;}
}