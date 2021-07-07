package study;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Program{

    public static void main(String[] args) {

        Person kate = new Person("Kate", 32);
        kate.displayInfo();

        // Importing packages and classes
        Scanner in = new Scanner(System.in);

        // Static import
        double result = sqrt(20);
        out.println(result);
    }
}
class Person{

    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name: %s \t Age: %d \n", name, age);
    }
}
