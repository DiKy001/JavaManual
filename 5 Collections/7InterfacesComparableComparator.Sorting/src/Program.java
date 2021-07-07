import java.util.Comparator;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        /* runtime error
        TreeSet<Person1> people = new TreeSet<Person1>();
        people.add(new Person1("Tom"));*/

        TreeSet<Person2> people1 = new TreeSet<Person2>();
        people1.add(new Person2("Tom"));

        PersonComparator pcomp1 = new PersonComparator();
        TreeSet<Person1> people2 = new TreeSet<Person1>(pcomp1);
        people2.add(new Person1("Tom"));
        people2.add(new Person1("Nick"));
        people2.add(new Person1("Alice"));
        people2.add(new Person1("Bill"));
        for(Person1  p : people2){
            System.out.println(p.getName());
        }

        Comparator<Person3> pcomp2 = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Person3> people3 = new TreeSet(pcomp2);
        people3.add(new Person3("Tom", 23));
        people3.add(new Person3("Nick",34));
        people3.add(new Person3("Tom",10));
        people3.add(new Person3("Bill",14));

        for(Person3  p : people3){

            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}

class Person1{

    private String name;
    Person1(String name){

        this.name=name;
    }
    String getName(){return name;}
}

class Person2 implements Comparable<Person2>{

    private String name;
    Person2(String name){

        this.name = name;
    }
    String getName(){return name;}

    public int compareTo(Person2 p){

        return name.compareTo(p.getName());
    }
}

class PersonComparator implements Comparator<Person1> {

    public int compare(Person1 a, Person1 b){

        return a.getName().compareTo(b.getName());
    }
}

class Person3{

    private String name;
    private int age;
    public Person3(String n, int a){

        name=n;
        age=a;
    }
    String getName(){return name;}
    int getAge(){return age;}
}

class PersonNameComparator implements Comparator<Person3>{

    public int compare(Person3 a, Person3 b){

        return a.getName().compareTo(b.getName());
    }
}

class PersonAgeComparator implements Comparator<Person3>{

    public int compare(Person3 a, Person3 b){

        if(a.getAge()> b.getAge())
            return 1;
        else if(a.getAge()< b.getAge())
            return -1;
        else
            return 0;
    }
}