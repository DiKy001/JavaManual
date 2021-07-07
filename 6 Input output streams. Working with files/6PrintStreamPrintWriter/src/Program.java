import java.io.*;

public class Program {

    public static void main(String[] args) {

        String text = "Hello world!";
        try(FileOutputStream fos=new FileOutputStream("notes3.txt");
            PrintStream printStream = new PrintStream(fos))
        {
            printStream.println(text);
            System.out.println("File written");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(PrintStream printStream = new PrintStream("notes3.txt"))
        {
            printStream.print("Hello World!");
            printStream.println("Welcome to Java!");

            printStream.printf("Name: %s Age: %d \n", "Tom", 34);

            String message = "PrintStream";
            byte[] message_toBytes = message.getBytes();
            printStream.write(message_toBytes);

            System.out.println("The file has been written");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(PrintWriter pw = new PrintWriter(System.out))
        {
            pw.println("Hello world!");
        }
    }
}