import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Stream<String> phoneStream = Stream.of("iPhone 6 S", "Lumia 950", "Samsung Galaxy S 6", "LG G 4", "Nexus 7");

        phoneStream.skip(1)
                .limit(2)
                .forEach(s->System.out.println(s));

        List<String> phones = new ArrayList<String>();
        phones.addAll(Arrays.asList("iPhone 6 S", "Lumia 950", "Huawei Nexus 6P",
                "Samsung Galaxy S 6", "LG G 4", "Xiaomi MI 5",
                "ASUS Zenfone 2", "Sony Xperia Z5", "Meizu Pro 5",
                "Lenovo S 850"));

        int pageSize = 3; // number of items per page
        Scanner scanner = new Scanner(System.in);
        while(true){

            System.out.println("Enter page number: ");
            int page = scanner.nextInt();

            if(page<1) break; // if the number is less than 1, exit the loop

            phones.stream().skip((long) (page - 1) * pageSize)
                    .limit(pageSize)
                    .forEach(s->System.out.println(s));
        }
    }
}
