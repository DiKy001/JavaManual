public class Program {
    public static void main(String[] args) {
        // If / else construct
        int num1 = 6;
        int num2 = 4;
        if(num1 > num2){
            System.out.println("The first number is greater than the second");
        }

        if(num1 > num2){
            System.out.println("The first number is greater than the second");
        }
        else{
            System.out.println("The first number is less than the second");
        }

        if(num1 > num2){
            System.out.println("The first number is greater than the second");
        }
        else if(num1<num2){
            System.out.println("The first number is less than the second");
        }
        else{
            System.out.println("The numbers are equal");
        }

        if(num1 > num2 && num1 > 7){
            System.out.println("The first number is greater than the second and greater than 7");
        }

        // Switch construct
        int num = 8;
        switch(num){

            case 1:
                System.out.println("the number is 1");
                break;
            case 8:
                System.out.println("the number is 8");
                num++;
                break;
            case 9:
                System.out.println("the number is 9");
                break;
            default:
                System.out.println("the number is not equal 1, 8, 9");
        }

        num = 3;
        int output = 0;
        switch(num){

            case 1:
                output = 3;
                break;
            case 2:
            case 3:
            case 4:
                output = 6;
                break;
            case 5:
                output = 12;
                break;
            default:
                output = 24;
        }
        System.out.println(output); // 6

        // Ternary operation
        int x = 3;
        int y = 2;
        int z = x < y ? (x+y) : (x-y);
        System.out.println(z); // 1
    }
}
