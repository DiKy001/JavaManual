import java.io.*;

public class Program {

    public static void main(String[] args) {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("notes4.txt")))
        {
            String text = "Hello  World!\nHey! Teachers! Leave them kids alone.";
            bw.write(text);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(BufferedReader br = new BufferedReader (new FileReader("notes4.txt")))
        {
            // reading by character
            int c;
            while((c=br.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter("notes5.txt")))
        {
            // reading by line
            String text;
            while(!(text=br.readLine()).equals("ESC")){

                bw.write(text + "\n");
                bw.flush();
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}