public class Program{

    public static void main(String[] args) {

        Employee sam = new Employee("Sam", "Leman Brothers");
        sam.display();
        Client bob = new Client("Bob", "Leman Brothers");
        bob.display();

        Rectangle rectangle = new Rectangle(0, 0, 5.7f, 9.3f);
        System.out.println("Perimeter of the rectangle is " + rectangle.getPerimeter());
        System.out.println("Area of the rectangle is " + rectangle.getArea());
    }
}
abstract class Person {

    private String name;

    public String getName() { return name; }

    public Person(String name){

        this.name=name;
    }

    public abstract void display();
}

class Employee extends Person{

    private String bank;

    public Employee(String name, String company) {

        super(name);
        this.bank = company;
    }

    public void display(){

        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}

class Client extends Person
{
    private String bank;

    public Client(String name, String company) {

        super(name);
        this.bank = company;
    }

    public void display(){

        System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}

abstract class Figure{

    float x; // x-coordinate of the point
    float y; // y-coordinate of the point

    Figure(float x, float y){

        this.x=x;
        this.y=y;
    }
    // abstract method for getting the perimeter
    public abstract float getPerimeter();
    // abstract method for getting the area
    public abstract float getArea();
}
// derived class of rectangle
class Rectangle extends Figure
{
    private float width;
    private float height;

    // constructor with reference to the constructor of the Figure class
    Rectangle(float x, float y, float width, float height){

        super(x,y);
        this.width = width;
        this.height = height;
    }

    public float getPerimeter(){

        return width * 2 + height * 2;
    }

    public float getArea(){

        return width * height;
    }
}
