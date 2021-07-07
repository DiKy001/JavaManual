public class Program{

    public static void main(String[] args) {

        Account acc1 = new Account(2334, 5000); // id - number
        int acc1Id = (int)acc1.getId();
        System.out.println(acc1Id);

        Account acc2 = new Account("sid5523", 5000);    // id - string
        System.out.println(acc2.getId());

        AnotherAccount<String> acc3 = new AnotherAccount<String>("2345", 5000);
        String acc3Id = acc3.getId();
        System.out.println(acc3Id);

        AnotherAccount<Integer> acc4 = new AnotherAccount<Integer>(2345, 5000);
        Integer acc4Id = acc4.getId();
        System.out.println(acc4Id);

        // Generalized interfaces
        Accountable<String> acc5 = new Account2("1235rwr", 5000);
        Account2 acc6 = new Account2("2373", 4300);
        System.out.println(acc5.getId());
        System.out.println(acc6.getId());

        Account3<String> acc7 = new Account3<String>("1235rwr", 5000);
        Account3<String> acc8 = new Account3<String>("2373", 4300);
        System.out.println(acc7.getId());
        System.out.println(acc8.getId());

        // Generalized methods
        Printer printer = new Printer();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
        printer.<String>print(people);
        printer.<Integer>print(numbers);

        // Using multiple generic parameters
        Account4<String, Double> acc9 = new Account4<String, Double>("354", 5000.87);
        String id = acc9.getId();
        Double sum = acc9.getSum();
        System.out.printf("Id: %s  Sum: %f \n", id, sum);

        // Generic Constructors
        Account5 acc10 = new Account5("cid2373", 5000);
        Account5 acc11 = new Account5(53757, 4000);
        System.out.println(acc10.getId());
        System.out.println(acc11.getId());
    }
}
class Account{

    private Object id;
    private int sum;

    Account(Object id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public Object getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}

class AnotherAccount<T>{

    private T id;
    private int sum;

    AnotherAccount(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}

interface Accountable<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}
class Account2 implements Accountable<String>{

    private String id;
    private int sum;

    Account2(String id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}

class Account3<T> implements Accountable<T>{

    private T id;
    private int sum;

    Account3(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}

class Printer{

    public <T> void print(T[] items){
        for(T item: items){
            System.out.println(item);
        }
    }
}

class Account4<T, S>{

    private T id;
    private S sum;

    Account4(T id, S sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public S getSum() { return sum; }
    public void setSum(S sum) { this.sum = sum; }
}

class Account5{

    private String id;
    private int sum;

    <T>Account5(T id, int sum){
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}