import java.util.Objects;

public class Program{

    public static void main (String args[]){

        Person tom = new Person("Tom", 36);

        System.out.println(tom.name());     // Tom
        System.out.println(tom.age());      // 36
        System.out.println(tom.hashCode());

        Person bob = new Person("Bob", 21);
        Person tomas = new Person("Tom", 36);
        System.out.println(tom.equals(bob));    // false
        System.out.println(tom.equals(tomas));  // true

        Person1 tom1 = new Person1("Tom", 36);
        System.out.println(tom1);

        System.out.println(tom1.name());     // Tom
        System.out.println(tom1.age());      // 36
        System.out.println(tom1.hashCode());

        Person1 bob1 = new Person1("Bob", 21);
        Person1 tomas1 = new Person1("Tom", 36);
        System.out.println(tom1.equals(bob1));    // false
        System.out.println(tom1.equals(tomas1));  // true

        // Record constructor
        Person2 tom2 = new Person2("Tom", -116);
        System.out.println(tom2);

        Person2 tom3 = new Person2("Tom", "Smith",  36);
        System.out.println(tom3);

        // Overriding Methods
        Person3 tom4 = new Person3("Tom", 36);
        System.out.println(tom4);
        System.out.println(tom4.name());
    }
}

class Person {
    private final String name;
    private final int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name() { return name; }
    int age() { return age; }

    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;
        Person other = (Person) o;
        return other.name == name && other.age == age;
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return String.format("Person[name=%s, age=%d]", name, age);
    }
}

record Person1(String name, int age) { }

record Person2(String name, int age) {

    Person2{

        if(age<1 || age > 110){
            age = 18;
        }
    }

    Person2(String firstName, String lastName, int age){

        this(firstName + " " + lastName, age);

    }
}

record Person3(String name, int age) {

    public String name() { return "Mister " + name; }

    public String toString() {
        return String.format("Person %s, Age: %d", name, age);
    }
}