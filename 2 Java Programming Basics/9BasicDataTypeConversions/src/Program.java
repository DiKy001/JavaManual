public class Program {
    public static void main(String[] args) {
        int a = 4;
        byte b = (byte)a;  // type conversion: int to byte
        System.out.println(b); // 4

        b = 7;
        int d = b;  // conversion from byte to int
        System.out.println(d); // 7

        a = 2147483647;
        float c = a;            // from int to float
        System.out.println(c);  // 2.14748365E9

        long e = 4;
        int f = (int) a;
        System.out.println(f); // 4

        // Data loss during conversion
        a = 5;
        b = (byte) a;
        System.out.println(b);      // 5

        a = 258;
        b = (byte) a;
        System.out.println(b);      // 2

        // Truncating rational numbers to integers
        double g = 56.9898;
        a = (int)a;
        System.out.println(a); // 56

        a = (int)Math.round(g);
        System.out.println(a); // 57

        // Transformations in operations
        a = 3;
        g = 4.6;
        double h = a+b;
        System.out.println(h); // 7.6

        b = 3;
        short i = 4;
        byte j = (byte)(b+i);
        System.out.println(j); // 7

        a = 'a' + 5;
        System.out.println(d);  // 102
    }
}
