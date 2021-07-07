public class Program{

    public static void main(String[] args) {

        Person kate = new Person("Kate", 32, "Baker Street", "+12334567");
        kate.displayName();     // fine, public method
        kate.displayAge();      // fine, method has a default modifier
        kate.displayPhone();    // fine, protected method
        //kate.displayAddress();  // ! Error, private method

        System.out.println(kate.name);      // fine, default modifier
        System.out.println(kate.address);   // fine, public modifier
        System.out.println(kate.age);       // fine, protected modifier
        //System.out.println(kate.phone);   // ! Error, private modifier

        AnotherPerson bob = new AnotherPerson("Bob", 30);
        System.out.println(bob.getAge());      // 30
        bob.setAge(33);
        System.out.println(bob.getAge());      // 33
        bob.setAge(123450);
        System.out.println(bob.getAge());      // 33
    }
}

class Person{

    String name;
    protected int age;
    public String address;
    private String phone;

    public Person(String name, int age, String address, String phone){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }
    public void displayName(){
        System.out.printf("Name: %s \n", name);
    }
    void displayAge(){
        System.out.printf("Age: %d \n", age);
    }
    private void displayAddress(){
        System.out.printf("Address: %s \n", address);
    }
    protected void displayPhone(){
        System.out.printf("Phone: %s \n", phone);
    }
}

class AnotherPerson{

    private String name;
    private int age;

    public AnotherPerson(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(age > 0 && age < 110)
            this.age = age;
    }
}
