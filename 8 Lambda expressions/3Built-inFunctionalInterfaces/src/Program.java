import java.util.Scanner;
import java.util.function.*;

public class Program {
    public static void main(String[] args) {

        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println(isPositive.test(5)); // true
        System.out.println(isPositive.test(-7)); // false

        BinaryOperator<Integer> multiply = (x, y) -> x*y;

        System.out.println(multiply.apply(3, 5)); // 15
        System.out.println(multiply.apply(10, -2)); // -20

        UnaryOperator<Integer> square = x -> x*x;
        System.out.println(square.apply(5)); // 25

        Function<Integer, String> convert = x-> String.valueOf(x) + " dollars";
        System.out.println(convert.apply(5)); // 5 dollars

        Consumer<Integer> printer = x-> System.out.printf("%d dollars \n", x);
        printer.accept(600); // 600 dollars

        Supplier<User> userFactory = ()->{

            Scanner in = new Scanner(System.in);
            System.out.println("Enter the name: ");
            String name = in.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println("Name user1: " + user1.getName());
        System.out.println("Name user2: " + user2.getName());
    }
}

class User{

    private String name;
    String getName(){
        return name;
    }

    User(String n){
        this.name=n;
    }
}
