public class Program {
    public static void main(String[] args) {

        Expression func = (n)-> n%2==0;
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(sum(nums, func)); // 20

        int[] nums1 = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        ExpressionHelper exprHelper = new ExpressionHelper();
        System.out.println(sum(nums, exprHelper::isEven)); // 0

        Expression expr = ExpressionHelper::isPositive;
        System.out.println(sum(nums1, expr));

        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("Tom");
        System.out.println(user.getName());

        Operation func1 = action(1);
        int a = func1.execute(6, 5);
        System.out.println(a);          // 11

        int b = action(2).execute(8, 2);
        System.out.println(b);          // 6
    }

    private static int sum (int[] numbers, Expression func)
    {
        int result = 0;
        for(int i : numbers)
        {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }

    private static Operation action(int number){
        switch(number){
            case 1: return (x, y) -> x + y;
            case 2: return (x, y) -> x - y;
            case 3: return (x, y) -> x * y;
            default: return (x,y) -> 0;
        }
    }
}

interface Expression{
    boolean isEqual(int n);
}

class ExpressionHelper{

    boolean isEven(int n){

        return n%2 == 0;
    }

    static boolean isPositive(int n){

        return n > 0;
    }
}

interface UserBuilder{
    User create(String name);
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

interface Operation{
    int execute(int x, int y);
}