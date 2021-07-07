public class Program {
    public static void main(String[] args) {
        int[] nums = new int[4];
        // set the values of array elements
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 100;

        // get the value of the third element of the array
        System.out.println(nums[2]);    // 4

        // Array length
        int[] nums1 = {1, 2, 3, 4, 5};
        int length = nums1.length;   // 5
        int last = nums[nums.length - 1]; // 4

        // Multidimensional arrays
        int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } };
        // set the element of the first column of the second row
        nums2[1][0]=44;
        System.out.println(nums2[1][0]);

        // Jagged array
        int[][] nums3 = new int[3][];
        nums3[0] = new int[2];
        nums3[1] = new int[3];
        nums3[2] = new int[5];

        //foreach
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        for (int i : array){

            System.out.println(i);
        }

        array = new int[] { 1, 2, 3, 4, 5 };
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        array = new int[] { 1, 2, 3, 4, 5 };
        for (int i=0; i<array.length;i++){
            array[i] = array[i] * 2;
            System.out.println(array[i]);
        }

        // Loop over multidimensional arrays
        nums3 = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < nums3.length; i++){
            for(int j=0; j < nums3[i].length; j++){

                System.out.printf("%d ", nums3[i][j]);
            }
            System.out.println();
        }
    }
}
