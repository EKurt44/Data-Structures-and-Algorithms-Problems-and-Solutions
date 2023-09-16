package ValidateSubsequence;

import java.util.Arrays;
import java.util.List;

//O(n)
public class main {
    public static void main(String[] args) {



        System.out.println("1 - "+isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10) ,Arrays.asList(1, 6, -1, 10)));
        System.out.println("2 - "+isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10) ,Arrays.asList(5, 1, 22, 22, 6, -1, 8, 10)));

    }

    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence
    ) {

        int arrLength=0;
        int seqLength=0;

        while(arrLength<array.size() && seqLength<sequence.size()){
            if(array.get(arrLength)==sequence.get(seqLength)){
                seqLength++;
            }
            arrLength++;
        }

        return seqLength==sequence.size();


    }
}
