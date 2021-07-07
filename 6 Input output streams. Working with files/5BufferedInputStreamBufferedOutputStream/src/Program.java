import java.io.*;

public class Program {

    public static void main(String[] args) {

        String text = "Hello world!";
        byte[] buffer = text.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buffer);

        try(BufferedInputStream bis = new BufferedInputStream(in)){

            int c;
            while((c=bis.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(Exception e){

            System.out.println(e.getMessage());
        }
        System.out.println();

        try(FileOutputStream out=new FileOutputStream("notes.txt");
            BufferedOutputStream bos = new BufferedOutputStream(out))
        {
            // line feed to bytes
            byte[] buffer1 = text.getBytes();
            bos.write(buffer1, 0, buffer1.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}