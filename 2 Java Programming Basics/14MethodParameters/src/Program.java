public class Program {
    static void sum(int x, int y){

        int z = x + y;
        System.out.println(z);
    }

    static void display(String name, int age){

        System.out.println(name);
        System.out.println(age);
    }

    static void sum(int ...nums){

        int result =0;
        for(int n: nums)
            result += n;
        System.out.println(result);
    }

    static void sum(String message, int ...nums){

        System.out.println(message);
        int result =0;
        for(int x:nums)
            result+=x;
        System.out.println(result);
    }

    public static void main (String args[]){

        int a = 6;
        int b = 8;
        sum(a, b);  // 14
        sum(3, a);  // 9
        sum(5, 23); // 28

        display("Tom", 34);
        display("Bob", 28);
        display("Sam", 23);

        sum(1, 2, 3);           // 6
        sum(1, 2, 3, 4, 5);     // 15
        sum();                  // 0

        sum("Welcome!", 20,10);
        sum("Hello World!");
    }
}
