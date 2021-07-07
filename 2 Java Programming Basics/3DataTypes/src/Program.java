public class Program {
    public static void main(String[] args) {
        boolean isActive = false;
        boolean isAlive = true;
        System.out.println("Boolean variables:\n" + isActive + "\n" + isAlive);

        // Integer numbers
        byte a = 3;
        byte b = 8;
        short c = 3;
        short d = 8;
        int e = 4;
        int f = 9;
        long g = 5;
        long h = 10L;
        int num = 234_567__789;
        System.out.println("\nInteger variables:\n" + a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" +
                f + "\n" + g + "\n" + h + "\n" + num);

        // Floating-point numbers
        double k = 8.5;
        double l = 2.7;
        float m = 8.5F;
        float n = 2.7F;
        System.out.println("\nFloating-point variables\n" + k + "\n" + l + "\n" + m + "\n" + n);

        // Characters and strings
        char ch=102; // character 'f'
        System.out.println("\nCharacter variable:\n" + ch);

        String hello = "Hello...";
        System.out.println("\nString variables:\n" + hello);
        String text = "Hello \nworld";
        System.out.println(text);
        String text1 = "Вот мысль, которой весь я предан,\n"+
                "Итог всего, что ум скопил.\n"+
                "Лишь тот, кем бой за жизнь изведан,\n"+
                "Жизнь и свободу заслужил.";
        System.out.println(text1);
        String text2 = """
                Вот мысль, которой весь я предан,
                Итог всего, что ум скопил.
                Лишь тот, кем бой за жизнь изведан,
                Жизнь и свободу заслужил.
                """;
        System.out.println(text2);
    }
}
