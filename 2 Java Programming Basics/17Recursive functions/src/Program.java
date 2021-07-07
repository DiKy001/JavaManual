public class Program {
    static int factorial(int x){

        if (x == 1){

            return 1;
        }
        return x * factorial(x - 1);
    }

    static int fibonacci(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(6)); // 720
        System.out.println(fibonacci(8)); // 21
    }
}
