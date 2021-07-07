public class Program{

    public static void main(String[] args) {

        Person kate = new Person("Kate");
        System.out.println(kate.getName());     // Kate
        changeName(kate);
        System.out.println(kate.getName());     // Alice
        changePerson(kate);
        System.out.println(kate.getName());     // Alice, no change happened
    }
    static void changePerson(Person p){
        p = new Person("Alice");    // p points to a new object
        p.setName("Ann");
    }
    static void changeName(Person p){
        p.setName("Alice");
    }
}

class Person{

    private String name;

    Person(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){

        return this.name;
    }
}
