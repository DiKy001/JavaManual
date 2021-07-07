public class Program {
    public static void main(String[] args) {
        // Comparison operations
        int a = 10;
        int b = 4;
        boolean c = a == b;         // false
        boolean d = a == 10;       // true
        System.out.println(c + "\n" + d);

        a = 10;
        b = 4;
        c = a != b;         // true
        d = a != 10;       // false
        System.out.println("\n" + c + "\n" + d);

        a = 10;
        b = 4;
        c = a < b;   // false
        System.out.println("\n" + c);

        a = 10;
        b = 4;
        c = a > b;   // true
        System.out.println("\n" + c);

        c = 10 >= 10;    // true
        d = 10 >= 4;     // true
        boolean e = 10 >= 20;    // false
        System.out.println("\n" + c + "\n" + d + "\n" + e);

        c = 10 <= 10;    // true
        d = 10 <= 4;     // false
        e = 10 <= 20;    // true
        System.out.println("\n" + c + "\n" + d + "\n" + e);

        //Logical operations
        boolean a1 = (5 > 6) || (4 < 6); // 5 > 6 - false, 4 < 6 - true, so it returns true
        boolean a2 = (5 > 6) || (4 > 6); // 5 > 6 - false, 4 > 6 - false, so it returns false
        boolean a3 = (5 > 6) && (4 < 6); // 5 > 6 - false, so it returns false (4 < 6 - true, but not calculated)
        boolean a4 = (50 > 6) && (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, so it returns true
        boolean a5 = (5 > 6) ^ (4 < 6); // 5 > 6 - true, so it returns true (4 < 6 - false)
        boolean a6 = (50 > 6) ^ (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, so it returns false
        System.out.println("\n" + a1 + "\n" + a2 + "\n" + a3 + "\n" + a4 + "\n" + a5 + "\n" + a6);

    }
}
