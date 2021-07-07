import java.util.*;
import java.util.stream.*;

public class Program {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Paris", "London", "Madrid");
        cities.stream() // get a stream
                .filter(s->s.length()==6) // filter by string length
                .forEach(s->System.out.println(s)); // output the filtered lines to the console

        cities = new ArrayList<String>();
        Collections.addAll(cities, "Paris", "London", "Madrid");

        Stream<String> citiesStream = cities.stream(); // get a stream
        citiesStream = citiesStream.filter(s->s.length()==6); // filter by string length
        citiesStream.forEach(s->System.out.println(s)); //  output the filtered lines to the console

        Stream<String> citiesStream1 = Arrays.stream(new String[]{"Paris", "London", "Madrid"}) ;
        citiesStream1.forEach(s->System.out.println(s)); // display all the elements of the array

        IntStream intStream = Arrays.stream(new int[]{1,2,4,5,7});
        intStream.forEach(i->System.out.println(i));

        LongStream longStream = Arrays.stream(new long[]{100,250,400,5843787,237});
        longStream.forEach(l->System.out.println(l));

        DoubleStream doubleStream = Arrays.stream(new double[] {3.4, 6.7, 9.5, 8.2345, 121});
        doubleStream.forEach(d->System.out.println(d));

        Stream<String> citiesStream2 =Stream.of("Paris", "London", "Madrid");
        citiesStream2.forEach(s->System.out.println(s));

        // you can pass an array
        String[] cities1 = {"Paris", "London", "Madrid"};
        Stream<String> citiesStream3 =Stream.of(cities1);

        IntStream intStream1 = IntStream.of(1,2,4,5,7);
        intStream1.forEach(i->System.out.println(i));

        LongStream longStream1 = LongStream.of(100,250,400,5843787,237);
        longStream1.forEach(l->System.out.println(l));

        DoubleStream doubleStream1 = DoubleStream.of(3.4, 6.7, 9.5, 8.2345, 121);
        doubleStream1.forEach(d->System.out.println(d));
    }
}