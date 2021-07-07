import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        Stream<String> citiesStream = Stream.of("Paris", "London", "Madrid","Berlin", "Brussels");
        citiesStream.forEach(s->System.out.println(s));
        citiesStream = Stream.of("Paris", "London", "Madrid","Berlin", "Brussels");
        citiesStream.forEach(System.out::println);
        citiesStream = Stream.of("Paris", "London", "Madrid","Berlin", "Brussels");
        citiesStream.filter(s->s.length()==6).forEach(s->System.out.println(s));

        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

        phoneStream.filter(p->p.getPrice()<50000).forEach(p->System.out.println(p.getName()));

        Stream<Phone> phoneStream1 = Stream.of(new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

        phoneStream1
                .map(p-> p.getName()) // put only phone names into the stream
                .forEach(s->System.out.println(s));
        phoneStream1 = Stream.of(new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));
        phoneStream1
                .map(p-> "name: " + p.getName() + " price: " + p.getPrice())
                .forEach(s->System.out.println(s));

        Stream<Phone> phoneStream2 = Stream.of(new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

        phoneStream2
                .flatMap(p->Stream.of(
                        String.format("name: %s  price without discount: %d", p.getName(), p.getPrice()),
                        String.format("name: %s  price without discount: %d", p.getName(),
                                p.getPrice() - (int)(p.getPrice()*0.1))
                ))
                .forEach(s->System.out.println(s));
    }
}

class Phone{

    private String name;
    private int price;

    public Phone(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
