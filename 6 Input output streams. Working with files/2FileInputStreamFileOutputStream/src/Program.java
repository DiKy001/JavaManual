import java.io.*;

public class Program {

    public static void main(String[] args) {

        String text = "Hello world!"; // string to write
        try(FileOutputStream fos=new FileOutputStream("notes.txt"))
        {
            // line feed to bytes
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");

        try(FileInputStream fin=new FileInputStream("notes.txt"))
        {
            System.out.printf("File size: %d bytes \n", fin.available());

            int i=-1;
            while((i=fin.read())!=-1){

                System.out.print((char)i);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileInputStream fin=new FileInputStream("notes.txt");
            FileOutputStream fos=new FileOutputStream("notes_new.txt"))
        {
            byte[] buffer = new byte[fin.available()];
            // read the buffer
            fin.read(buffer, 0, buffer.length);
            // write from buffer to file
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}