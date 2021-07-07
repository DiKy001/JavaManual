import java.util.Optional;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> result = numbersStream.parallel().reduce((x,y)-> x*y);
        System.out.println(result.get()); // 720

        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму", "hello world");
        String sentence = wordsStream.parallel()
                .filter(s->s.length()<10) // filtering over parallel stream
                .sequential()
                .reduce("Результат:", (x,y)->x + " " + y); // serial stream operation
        System.out.println(sentence);

        Stream<Integer> numbersStream1 = Stream.of(1, 2, 3, 4, 5, 6);
        Integer result1 = numbersStream1.parallel().reduce(1, (x,y)->x * y);
        System.out.println(result1);

    }
}