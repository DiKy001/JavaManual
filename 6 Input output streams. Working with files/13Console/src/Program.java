import java.io.Console;

public class Program {

    public static void main(String[] args) {

        // get the console
        Console console = System.console();
        if(console!=null){
            // read data from the console
            String login = console.readLine("Enter the login:");
            char[] password = console.readPassword("Enter the password:");

            console.printf("Entered login: %s \n", login);
            console.printf("Entered password: %s \n", new String(password));
        }
    }
}