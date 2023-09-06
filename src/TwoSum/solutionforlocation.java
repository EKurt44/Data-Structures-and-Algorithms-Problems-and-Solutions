package TwoSum;

import java.util.HashMap;
//O(n)
public class solutionforlocation {
    public static void main(String[] args) {

        int[] res = new int[2];
        res = twoSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        System.out.println(res[0] + " " + res[1]);

        res = twoSum(new int[]{-7, -5, -3, -1, 0, 1, 3, 5, 7}, -5);
        System.out.println(res[0] + " " + res[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        HashMap<Integer,Integer> index= new HashMap<>();


        for(int i=0;i<nums.length;i++){
            int potentialMatch=target-nums[i];
            if(index.containsKey(potentialMatch)){
                result[0]=index.get(potentialMatch);
                result[1]=i;
                return result;
            }else{
                index.put(nums[i],i);
            }
        }
        return result;
    }
}
