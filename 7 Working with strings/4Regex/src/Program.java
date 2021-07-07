import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args) {
        String text = "FIFA will never regret it";
        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        for(String word : words){
            System.out.println(word);
        }

        String input = "+12343454556";
        boolean result = input.matches("(\\+*)\\d{11}");
        if(result){
            System.out.println("It is a phone number");
        }
        else{
            System.out.println("It is not a phone number!");
        }

        input = "Hello";
        boolean found = Pattern.matches("Hello", input);
        if(found)
            System.out.println("Найдено");
        else
            System.out.println("Не найдено");

        input = "Hello";
        Pattern pattern = Pattern.compile("Hello");
        Matcher matcher = pattern.matcher(input);
        found = matcher.matches();
        if(found)
            System.out.println("Найдено");
        else
            System.out.println("Не найдено");

        input = "Hello Java! Hello JavaScript! JavaSE 8.";
        pattern = Pattern.compile("Java(\\w*)");
        matcher = pattern.matcher(input);
        while(matcher.find())
            System.out.println(matcher.group());

        input = "Hello Java! Hello JavaScript! JavaSE 8.";
        pattern = Pattern.compile("Java(\\w*)");
        matcher = pattern.matcher(input);
        String newStr = matcher.replaceAll("HTML");
        System.out.println(newStr); // Hello HTML! Hello HTML! HTML 8.

        input = "Hello Java! Hello JavaScript! JavaSE 8.";
        String myStr =input.replaceAll("Java(\\w*)", "HTML");
        System.out.println(myStr); // Hello HTML! Hello HTML! HTML 8.

        input = "Hello Java! Hello JavaScript! JavaSE 8.";
        pattern = Pattern.compile("[ ,.!?]");
        words = pattern.split(input);
        for(String word:words)
            System.out.println(word);
    }
}
