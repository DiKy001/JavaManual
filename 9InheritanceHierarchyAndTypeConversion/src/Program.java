public class Program{

    public static void main(String[] args) {

        Person tom = new Person("Tom");
        tom.display();
        Person sam = new Employee("Sam", "Oracle");
        sam.display();
        Person bob = new Client("Bob", "DeutscheBank", 3000);
        bob.display();

        Object tom1 = new Person("Tom");
        Object sam1 = new Employee("Sam", "Oracle");
        Object kate1 = new Client("Kate", "DeutscheBank", 2000);
        Person bob1 = new Client("Bob", "DeutscheBank", 3000);
        Person alice1 = new Employee("Alice", "Google");

        Object sam2 = new Employee("Sam", "Oracle");

        // downcast from Object to type Employee
        Employee emp = (Employee)sam2;
        emp.display();
        System.out.println(emp.getCompany());

        Object kate3 = new Client("Kate", "DeutscheBank", 2000);
        ((Person)kate3).display();

        Object sam3 = new Employee("Sam", "Oracle");
        ((Employee)sam3).display();

        Object kate4 = new Client("Kate", "DeutscheBank", 2000);

        /* Runtime error
        Employee emp4 = (Employee) kate4;
        emp4.display();

        // or
        ((Employee)kate4).display();*/

        Object kate5 = new Client("Kate", "DeutscheBank", 2000);
        if(kate5 instanceof Employee){
            Employee employeeKate = (Employee) kate5;
            employeeKate.display();
        }
        else{
            System.out.println("Conversion is invalid");
        }

        Object kate6 = new Client("Kate", "DeutscheBank", 2000);
        if(kate6 instanceof Client){
            Client clientKate = (Client) kate6;
            clientKate.display();
        }
        else{
            System.out.println("Conversion is invalid");
        }

        Object kate7 = new Client("Kate", "DeutscheBank", 2000);
        if(kate7 instanceof Client clientKate){
            clientKate.display();
        }
        else{
            System.out.println("Conversion is invalid");
        }
    }
}

class Person {

    private String name;

    public String getName() { return name; }

    public Person(String name){

        this.name=name;
    }

    public void display(){

        System.out.printf("Person %s \n", name);
    }
}

class Employee extends Person{

    private String company;

    public Employee(String name, String company) {

        super(name);
        this.company = company;
    }
    public String getCompany(){ return company; }

    public void display(){

        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}

class Client extends Person{

    private int sum; // account amount
    private String bank;

    public Client(String name, String bank, int sum) {

        super(name);
        this.bank=bank;
        this.sum=sum;
    }

    public void display(){

        System.out.printf("Client %s has account in %s \n", super.getName(), bank);
    }

    public String getBank(){ return bank; }
    public int getSum(){ return sum; }
}