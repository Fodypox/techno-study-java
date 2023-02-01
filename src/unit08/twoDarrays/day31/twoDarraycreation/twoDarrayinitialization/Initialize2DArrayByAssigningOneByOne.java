package unit08.twoDarrays.day31.twoDarraycreation.twoDarrayinitialization;

import java.util.Arrays;

public class Initialize2DArrayByAssigningOneByOne {
    public static void main(String[] args) {
        int[][] numbers = new int[3][2];
        int[] nums0 = {2,3};
        int[] nums1 = {4,19};
        int[] nums2 = {-35,31213};

        numbers[0] = nums0;
        numbers[1] = nums1;
        numbers[2] = nums2;

        System.out.println(Arrays.deepToString(numbers));

        int[][] numbers2 = new int[3][];
        System.out.println(Arrays.deepToString(numbers2));
        int[] test0 = {2,3,5};
        int[] test1 = {4,19};
        int[] test2 = {-35,31213,6,7};
        numbers2[0] = test0;
        numbers2[1] = test1;
        numbers2[2] = test2;

        System.out.println(Arrays.deepToString(numbers2));





    }
}
