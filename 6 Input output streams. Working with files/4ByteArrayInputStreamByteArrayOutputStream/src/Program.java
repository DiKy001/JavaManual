import java.io.*;

public class Program {

    public static void main(String[] args) {

        byte[] array1 = new byte[]{1, 3, 5, 7};
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1);
        int b;
        while((b=byteStream1.read())!=-1){

            System.out.println(b);
        }

        String text = "Hello world!";
        byte[] array2 = text.getBytes();
        // read 5 characters
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2, 0, 5);
        int c;
        while((c=byteStream2.read())!=-1){
            System.out.println((char)c);
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = text.getBytes();
        try{
            baos.write(buffer);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        // convert a byte array to a string
        System.out.println(baos.toString());

        // get an array of bytes and output character by character
        byte[] array = baos.toByteArray();
        for(byte bb: array){

            System.out.print((char)bb);
        }
        System.out.println();

        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        byte[] buffer1 = text.getBytes();
        try{
            baos1.write(buffer1);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        try(FileOutputStream fos = new FileOutputStream("hello.txt")){

            baos1.writeTo(fos);
        }
        catch(IOException e){

            System.out.println(e.getMessage());
        }
    }
}