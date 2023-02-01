package javaprojects.Nebahat;

import java.util.HashMap;
import java.util.Map;

public class GoodPairs {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1,1,3};
        int[] nums2 = {1,1,1,1};
        int[] nums3 = {1,2,3};
        /*int i and j
        * int[] nums = {a,b,c}
        * nums[i]==nums[j] and i<j
        * 4 a,b,c,d
        * n(n-1)/2
        * {1,1,1}
        * {1=3}
        * 3*2/2*/
        System.out.println(numIdenticalPairs(nums1));
        System.out.println(numIdenticalPairs(nums2));
        System.out.println(numIdenticalPairs(nums3));

    }
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int f : map.values()) {
            count += f * (f - 1) / 2;
            /*{1=3,2=1,3=2}*/
        }
        return count;
    }
}
