public class Program{

    public static void main(String[] args) {

        Person undef = new Person();
        undef.displayInfo();

        Person tom = new Person("Tom");
        tom.displayInfo();

        Person kate = new Person("Kate", 25);
        kate.displayInfo();
    }
}

class Person{

    String name;
    int age;

    /*start of initializer block*/
    {
        name = "Undefined";
        age = 18;
    }
    /*end of initializer block*/
    Person(){

    }

    Person(String name){

        this.name = name;
    }

    Person(String name, int age){

        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}