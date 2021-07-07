public class Program {

    static int x = 10;
    static int y = 20;

    public static void main(String[] args) {

        Operationable operation;
        operation = (x,y)->x+y;

        int result = operation.calculate(10, 20);
        System.out.println(result); //30

        Operationable operation1 = (int x, int y)-> x + y;
        Operationable operation2 = (int x, int y)-> x - y;
        Operationable operation3 = (int x, int y)-> x * y;

        System.out.println(operation1.calculate(20, 10)); //30
        System.out.println(operation2.calculate(20, 10)); //10
        System.out.println(operation3.calculate(20, 10)); //200

        Printable printer = s->System.out.println(s);
        printer.print("Hello Java!");

        Operation1 op = ()->{

            x=30;
            return x+y;
        };
        System.out.println(op.calculate()); // 50
        System.out.println(x); // 30 - значение x изменилось

        int n=70;
        int m=30;
        Operation1 op1 = ()->{

            //n=100; - так нельзя сделать
            return m+n;
        };
        // n=100;  - так тоже нельзя
        System.out.println(op1.calculate()); // 100

        Operationable operation4 = (int x, int y)-> {

            if(y==0)
                return 0;
            else
                return x/y;
        };

        System.out.println(operation4.calculate(20, 10)); //2
        System.out.println(operation4.calculate(20, 0)); //0

        Operationable1<Integer> operation5 = (x, y)-> x + y;
        Operationable1<String> operation6 = (x, y) -> x + y;

        System.out.println(operation5.calculate(20, 10)); //30
        System.out.println(operation6.calculate("20", "10")); //2010
    }
}
interface Operationable{
    int calculate(int x, int y);
}

interface Printable{
    void print(String s);
}

interface Operation1{
    int calculate();
}

interface Operationable1<T>{
    T calculate(T x, T y);
}