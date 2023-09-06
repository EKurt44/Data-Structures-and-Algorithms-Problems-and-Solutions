package TwoSum;

import java.util.HashSet;
import java.util.Set;
//O(n)
public class solution2 {
    public static void main(String[] args) {
        int[] res = new int[2];
        res = twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        System.out.println(res[0] + " " + res[1]);

        res = twoNumberSum(new int[]{-7, -5, -3, -1, 0, 1, 3, 5, 7}, -5);
        System.out.println(res[0] + " " + res[1]);

    }
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> nums = new HashSet<>();
        for(int num:array){
            int potentialMatch=targetSum-num;
            if(nums.contains((potentialMatch))){
                return new int[]{potentialMatch,num};
            }else{
                nums.add(num);
            }
        }
        return new int[0];

    }
    }
