public class Program{

    public static void main(String[] args) {

        // Static fields
        Person tom = new Person();
        Person bob = new Person();

        tom.displayId();    // Id = 1
        bob.displayId();    // Id = 2
        System.out.println(Person.counter); // 3

        // change Person.counter
        Person.counter = 8;

        Person sam = new Person();
        sam.displayId();    // Id = 8

        // Static constants
        double radius = 60;
        System.out.printf("Radius: %f \n", radius);             // 60
        System.out.printf("Area: %f \n", Math.PI * radius);     // 188,4

        // Static initializers
        tom = new Person();
        bob = new Person();

        tom.displayId();    // Id = 9
        bob.displayId();    // Id = 10

        // Static methods

        Person.displayCounter();    // Counter: 11

        System.out.println(Operation.sum(45, 23));          // 68
        System.out.println(Operation.subtract(45, 23));     // 22
        System.out.println(Operation.multiply(4, 23));      // 92

    }
}

class Person{

    private int id;
    static int counter;

    static{
        counter = 1;
        System.out.println("Static initializer");
    }

    Person(){
        id = counter++;
        System.out.println("Constructor");
    }

    // статический метод
    public static void displayCounter(){

        System.out.printf("Counter: %d \n", counter);
    }

    public void displayId(){

        System.out.printf("Id: %d \n", id);
    }
}

class Math{
    public static final double PI = 3.14;
}

class Operation{

    static int sum(int x, int y){
        return x + y;
    }
    static int subtract(int x, int y){
        return x - y;
    }
    static int multiply(int x, int y){
        return x * y;
    }
}