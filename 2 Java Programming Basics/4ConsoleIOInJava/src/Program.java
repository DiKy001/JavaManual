import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Bye world...");

        System.out.print("Hello world!");
        System.out.print("Bye world...");


        System.out.print("Hello world \n");

        int x=5;
        int y=6;
        System.out.println("x=" + x + "; y=" + y);

        System.out.printf("x=%d; y=%d \n", x, y);

        String name = "Tom";
        int age = 30;
        float height = 1.7f;

        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.printf("Your number: %d \n", num);

        System.out.print("Input name: ");
        in.nextLine();
        name = in.nextLine();
        System.out.print("Input age: ");
        age = in.nextInt();
        System.out.print("Input height: ");
        height = in.nextFloat();
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
        in.close();
    }
}
