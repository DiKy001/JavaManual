public class Program{

    public static void main(String[] args) {

        Printable printable = new Book("Java. Complete Reference", "H. Shildt");
        printable.print();      //  Java. Complete Reference (H. Shildt)
        printable = new Journal("Foreign Policy");
        printable.print();      // Foreign Policy

        Printable p = new Journal("Foreign Affairs");
        p.print();
        // The interface does not have a getName method, an explicit cast is required
        String name = ((Journal)p).getName();
        System.out.println(name);

        // Static interface method
        Printable.read();

        // Private interface methods
        Calculable c = new Calculation();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1, 2, 4));

        // Constants in interface
        WaterPipe pipe = new WaterPipe();
        pipe.printState(1);

        // Interfaces as parameters and method results
        printable = createPrintable("Foreign Affairs",false);
        printable.print();

        read(new Book("Java for impatient", "Cay Horstmann"));
        read(new Journal("Java Daily News"));
    }

    static void read(Printable p){

        p.print();
    }

    static Printable createPrintable(String name, boolean option){

        if(option)
            return new Book(name, "Undefined");
        else
            return new Journal(name);
    }
}

interface Printable{

    default void print(){

        System.out.println("Undefined printable");
    }

    static void read(){

        System.out.println("Read printable");
    }
}
class Book implements Printable{

    String name;
    String author;

    Book(String name, String author){

        this.name = name;
        this.author = author;
    }

    public void print() {

        System.out.printf("%s (%s) \n", name, author);
    }
}
class Journal implements Printable {

    private String name;

    String getName(){
        return name;
    }

    Journal(String name){

        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}

class Calculation implements Calculable {

}

interface Calculable {

    default int sum(int a, int b){
        return sumAll(a, b);
    }
    default int sum(int a, int b, int c){
        return sumAll(a, b, c);
    }

    private int sumAll(int... values){
        int result = 0;
        for(int n : values){
            result += n;
        }
        return result;
    }
}

class WaterPipe implements Settable {

    public void printState(int n){
        if(n==OPEN)
            System.out.println("Water is opened");
        else if(n==CLOSED)
            System.out.println("Water is closed");
        else
            System.out.println("State is invalid");
    }
}
interface Settable {

    int OPEN = 1;
    int CLOSED = 0;

    void printState(int n);
}