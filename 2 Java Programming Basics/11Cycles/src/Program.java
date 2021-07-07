public class Program {
    public static void main(String[] args) {
        // For loop
        for (int i = 1; i < 9; i++){
            System.out.printf("The square of %d is %d \n", i, i * i);
        }

        int k = 1;
        for (; k<9;){
            System.out.printf("The square of %d is %d \n", k, k * k);
            k++;
        }

        int n = 10;
        for(int i = 0, j = n - 1; i < j; i++, j--){

            System.out.println(i * j);
        }

        // Do loop
        int j = 7;
        do{
            System.out.println(j);
            j--;
        }
        while (j > 0);

        j = -1;
        do{
            System.out.println(j);
            j--;
        }
        while (j > 0);

        // While loop

        j = 6;
        while (j > 0){

            System.out.println(j);
            j--;
        }

        // The continue and break statements
        for (int i = 0; i < 10; i++){
            if (i == 5)
                break;
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++){
            if (i == 5)
                continue;
            System.out.println(i);
        }
    }
}
