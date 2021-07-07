public class Program {

    public static void main(String[] args) {

        Thread t = Thread.currentThread(); // get main thread
        System.out.println(t.getName()); // main
        System.out.println(t); // main
    }
}
