public class Program{

    public static void main(String[] args) {

        Employee sam = new Employee("Sam", "Microsoft");
        sam.display();  // Sam
        sam.work();     // Sam works in Microsoft
    }
}
class Person {

    private String name;
    public String getName(){ return name; }

    public Person(String name){

        this.name=name;
    }

    public final void display(){

        System.out.println("Name: " + name);
    }
}
class Employee extends Person{

    private String company;

    public Employee(String name, String company) {

        super(name);
        this.company=company;
    }

    public void work(){
        System.out.printf("%s works in %s \n", getName(), company);
    }

    /* display is final method
    @Override
    public void display(){

        System.out.printf("Name: %s \n", getName());
        System.out.printf("Works in %s \n", company);
    }*/
}