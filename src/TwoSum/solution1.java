package TwoSum;
//O(n^2)
public class solution1 {
    public static void main(String[] args) {
        int[] res = new int[2];
        res = twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        System.out.println(res[0] + " " + res[1]);

        res = twoNumberSum(new int[]{-7, -5, -3, -1, 0, 1, 3, 5, 7}, -5);
        System.out.println(res[0] + " " + res[1]);


    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length - 1; i++) {
            int firstNum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int secondNum = array[j];
                if (firstNum + secondNum == targetSum) {
                    return new int[]{firstNum, secondNum};
                }
            }
        }
        return new int[0];
    }
}
