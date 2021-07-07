import java.util.Arrays;
import java.util.Comparator;

public class Program {

    public static void main(String[] args) {

        int[] numbers = initializeArray(6);
        for(int i: numbers)
            System.out.println(i);

        Phone[] phones = new Phone[]{new Phone("iPhone 8", 54000),
                new Phone("Pixel 2", 45000),
                new Phone("Samsung Galaxy S9", 40000),
                new Phone("Nokia 9", 32000)};

        Arrays.parallelSetAll(phones, i -> {
            phones[i].setPrice(phones[i].getPrice()-10000);
            return phones[i];
        });

        for(Phone p: phones)
            System.out.printf("%s - %d \n", p.getName(), p.getPrice());

        int[] nums = {30, -4, 5, 29, 7, -8};
        Arrays.parallelSort(nums);
        for(int i: nums)
            System.out.println(i);

        Phone[] phones1 = new Phone[]{new Phone("iPhone 8", 54000),
                new Phone("Pixel 2", 45000),
                new Phone("Samsung Galaxy S9", 40000),
                new Phone("Nokia 9", 32000)};

        Arrays.parallelSort(phones,new PhoneComparator());

        for(Phone p: phones1)
            System.out.println(p.getName());

        int[] numbers2 = {1, 2, 3, 4, 5, 6};
        Arrays.parallelPrefix(numbers2, (x, y) -> x * y);

        for(int i: numbers2)
            System.out.println(i);

    }

    public static int[] initializeArray(int size) {
        int[] values = new int[size];
        Arrays.parallelSetAll(values, i -> i*10);
        return values;

    }
}

class PhoneComparator implements Comparator<Phone> {

    public int compare(Phone a, Phone b){

        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }
}

class Phone{

    private String name;
    private int price;

    public Phone(String name, int price){
        this.name=name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String val) {
        this.name=val;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int val) {
        this.price=val;
    }
}