import java.io.*;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
            // writing the entire string
            String text = "Hello Gold!";
            writer.write(text);
            // writing by character
            writer.append('\n');
            writer.append('E');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileReader reader = new FileReader("notes3.txt"))
        {
            // read character by character
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileReader reader = new FileReader("notes3.txt"))
        {
            char[] buf = new char[256];
            int c;
            while((c = reader.read(buf))>0){

                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}