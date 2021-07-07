public class Program {
    public static void main(String[] args) {
        // Logical multiplication
        int a1 = 2; //010
        int b1 = 5;//101
        System.out.println(a1&b1); // result 0

        int a2 = 4; //100
        int b2 = 5; //101
        System.out.println(a2 & b2); // result 4

        // Logical addition
        a1 = 2; //010
        b1 = 5;//101
        System.out.println(a1|b1); // result 7 - 111
        a2 = 4; //100
        b2 = 5;//101
        System.out.println(a2 | b2); // result 5 - 101

        // Logical exclusive OR
        int number = 45; // 1001 The value to be encrypted is in binary form 101101
        int key = 102; // Encryption key - in binary 1100110
        int encrypt = number ^ key; // The result will be the number 1001011 or 75
        System.out.println("Encrypted number: " + encrypt);

        int decrypt = encrypt ^ key; // The result will be the original number 45
        System.out.println("Decrypted number: " + decrypt);

        // Logical negation
        byte a = 12;                 // 0000 1100
        System.out.println(~a);     //  1111 0011   or -13

        // Shift operations
        a1 = 4;
        b1 = 1;
        System.out.println(a1 << b1); // 1000 or 8
        a2 = 16;
        b2 = 1;
        System.out.println(a2 >> b2); // 1000 or 8
        int a3 = -8;
        int b3 = 2;
        System.out.println(a3 >>> b3); // 1073741822
    }
}
