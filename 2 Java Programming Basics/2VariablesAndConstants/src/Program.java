public class Program {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 25;
        System.out.println(x);  // 10
        System.out.println(y);  // 25

        System.out.println(x);  // 10
        x = 25;
        System.out.println(x);  // 25

        var z = 10;
        System.out.println(z);  // 10

        final int LIMIT = 5;
        System.out.println(LIMIT);  // 5
        // LIMIT=57; // we can no longer write, since LIMIT is a constant
    }
}
