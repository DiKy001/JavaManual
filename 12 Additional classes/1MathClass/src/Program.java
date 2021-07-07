import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        double result = Math.abs(-13.5); // 13.5
        System.out.println(result);

        result = Math.acos(1); // 0.0
        System.out.println(result);

        result = Math.cbrt(27); // 3
        System.out.println(result);

        result = Math.ceil(2.34); // 3
        System.out.println(result);

        result = Math.floor(2.56); // 2
        System.out.println(result);

        System.out.println(Math.floorDiv(1, 2)); // 0
        System.out.println(Math.floorDiv(7, 2)); // 3
        System.out.println(Math.floorDiv(9, 2)); // 4

        System.out.println(Math.rint(2)); // 2.0
        System.out.println(Math.rint(2.3)); // 2.0
        System.out.println(Math.rint(2.5)); // 2.0
        System.out.println(Math.rint(2.5001)); // 3.0
        System.out.println(Math.rint(2.8)); // 3.0

        System.out.println(Math.round(2.3)); // 2
        System.out.println(Math.round(2.5)); // 3
        System.out.println(Math.round(2.5001)); // 3
        System.out.println(Math.round(2.8)); // 3

        System.out.println(Math.scalb(5, 3)); // 5*2*2*2 = 40
        System.out.println(Math.scalb(3, 4)); // 3*2*2*2*2 = 48

        System.out.println(Math.signum(2.3)); // 1
        System.out.println(Math.signum(-2.3)); // -1

        result = Math.sqrt(16); // 4
        System.out.println(result);

        System.out.println(Math.toDegrees(3.14159)); // 180
        System.out.println(Math.toRadians(90)); // 1,57079....

        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter the radius of the circle: ");
        int radius = in.nextInt();
        long area = Math.round(Math.PI * Math.pow(radius, 2));
        System.out.printf("Area of a circle with a radius of %d is %d \n", radius, area);

    }
}
