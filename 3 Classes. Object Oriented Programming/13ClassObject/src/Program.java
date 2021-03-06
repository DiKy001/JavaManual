public class Program{

    public static void main(String[] args) {

        Person tom = new Person("Tom");
        System.out.println(tom);
        System.out.println(tom.hashCode());
        System.out.println(tom.getClass());
        Person bob = new Person("Bob");
        System.out.println(tom.equals(bob)); // false

        Person tom2 = new Person("Tom");
        System.out.println(tom.equals(tom2)); // true
    }
}
class Person {

    private String name;

    public Person(String name){

        this.name=name;
    }

    @Override
    public String toString(){

        return "Person " + name;
    }

    @Override
    public int hashCode(){

        return 10 * name.hashCode() + 20456;
    }

    @Override
    public boolean equals(Object obj){

        if (!(obj instanceof Person)) return false;

        Person p = (Person)obj;
        return this.name.equals(p.name);
    }
}