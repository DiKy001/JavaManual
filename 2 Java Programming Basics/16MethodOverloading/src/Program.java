public class Program {
    static int sum(int x, int y){
        return x + y;
    }

    static double sum(double x, double y){
        return x + y;
    }

    static int sum(int x, int y, int z){
        return x + y + z;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 3));          // 5
        System.out.println(sum(4.5, 3.2));      // 7.7
        System.out.println(sum(4, 3, 7));       // 14
    }
}
