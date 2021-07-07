public class Program {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Hello";
        String str3 = str1 + " " + str2;

        System.out.println("\n" + str3); // Hello Java

        String str4 = "Год " + 2021;
        System.out.println("\n" + str4);

        String str5 = "Java";
        String str6 = "Hello";
        str6 = str5.concat(str1); // HelloJava
        System.out.println("\n" + str6);

        String str7 = "Java";
        String str8 = "Hello";
        String str9 = String.join(" ", str8, str7); // Hello Java
        System.out.println("\n" + str9);

        char c = str1.charAt(2);
        System.out.println("\n" + c); // v

        String str = "Hello world!";
        int start = 6;
        int end = 11;
        char[] dst=new char[end - start];
        str.getChars(start, end, dst, 0);
        System.out.println("\n" + dst); // world

        str1 = "Hello";
        str2 = "hello";
        System.out.println("\n" + str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true

        str1 = "Hello world";
        str2 = "I work";
        boolean result = str1.regionMatches(6, str2, 2, 3);
        System.out.println("\n" + result); // true

        str1 = "hello";
        str2 = "world";
        str3 = "hell";
        System.out.println("\n" + str1.compareTo(str2)); // -15 - str1 меньше чем strt2
        System.out.println(str1.compareTo(str3)); // 1 - str1 больше чем str3

        str = "Hello world";
        int index1 = str.indexOf('l'); // 2
        int index2 = str.indexOf("wo"); //6
        int index3 = str.lastIndexOf('l'); //9
        System.out.println("\n" + index1 + "\n" + index2 + "\n" + index3);

        str = "myfile.exe";
        boolean start1 = str.startsWith("my"); //true
        boolean end2 = str.endsWith("exe"); //true
        System.out.println("\n" + start1 + "\n" + end2);

        str = "Hello world";
        String replStr1 = str.replace('l', 'd'); // Heddo wordd
        String replStr2 = str.replace("Hello", "Bye"); // Bye world
        System.out.println("\n" + replStr1 + "\n" + replStr2);

        str = "  hello world  ";
        str = str.trim(); // hello world
        System.out.println("\n" + str);

        str = "Hello world";
        String substr1 = str.substring(6); // world
        String substr2 = str.substring(3,5); //lo
        System.out.println("\n" + substr1 + "\n" + substr2);

        str = "Hello World";
        System.out.println("\n" + str.toLowerCase()); // hello world
        System.out.println(str.toUpperCase() + "\n" ); // HELLO WORLD

        String text = "FIFA will never regret it";
        String[] words = text.split(" ");
        for(String word : words){
            System.out.println(word);
        }

    }
}
