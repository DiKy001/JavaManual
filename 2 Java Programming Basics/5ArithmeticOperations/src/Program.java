public class Program {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c = a + b;  // 17
        int d = 4 + b;  // 11

        a = 10;
        b = 7;
        c = a - b;  // 3
        d = 4 - a;  // -6

        a = 10;
        b = 7;
        c = a * b;  // 70
        d = b * 5;  // 35

        a = 20;
        b = 5;
        c = a / b;  // 4
        double e = 22.5 / 4.5;  // 5.0

        double k = 10 / 4;     // 2
        System.out.println(k);

        k = 10.0 / 4;     // 2.5
        System.out.println(k);

        a = 33;
        b = 5;
        c = a % b;  // 3
        d = 22 % 4; // 2 (22 - 4*5 = 2)

        a = 8;
        b = ++a;
        System.out.println(a);  // 9
        System.out.println(b);  // 9

        a = 8;
        b = a++;
        System.out.println(a);  // 9
        System.out.println(b);  // 8

        a = 8;
        b = --a;
        System.out.println(a);  // 7
        System.out.println(b);  // 7

        a = 8;
        b = a--;
        System.out.println(a);  // 7
        System.out.println(b);  // 8

        // Arithmetic priority
        a = 8;
        b = 7;
        c = a + 5 * ++b;
        System.out.println(c);  // 48

        a = 8;
        b = 7;
        c = (a + 5) * ++b;
        System.out.println(c);  // 104

        // Associativity of operations
        int x = 10 / 5 * 2;
        System.out.println(x);  // 4

        // Floating-point operations
        e = 2.0 - 1.1;
        System.out.println(e);
    }
}
