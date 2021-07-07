import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try{
            int[] numbers = new int[3];
            numbers[4]=45;
            System.out.println(numbers[4]);
        }
        catch(Exception ex){

            ex.printStackTrace();
        }
        System.out.println("Program completed");

        try{
            int[] numbers = new int[3];
            numbers[4]=45;
            System.out.println(numbers[4]);
        }
        catch(Exception ex){

            ex.printStackTrace();
        }
        finally{
            System.out.println("finally block");
        }
        System.out.println("Program completed");

        int[] numbers = new int[3];
        try{
            numbers[6]=45;
            numbers[6]=Integer.parseInt("gfd");
        }
        catch(ArrayIndexOutOfBoundsException ex){

            System.out.println("Out of bounds of an array");
        }
        catch(NumberFormatException ex){

            System.out.println("String to number conversion error");
        }

        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number");
            int x = in.nextInt();
            if(x >= 30){
                throw new Exception("The number x must be less than 30");
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("Program completed");
    }
}
