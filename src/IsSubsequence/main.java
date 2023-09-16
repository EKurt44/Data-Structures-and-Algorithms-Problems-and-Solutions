package IsSubsequence;

public class main {
    public static void main(String[] args) {


        System.out.println( isSubsequence("abgc","ahbgdc"));
        System.out.println( isSubsequence("axc","ahbgdc"));


    }

    public static boolean isSubsequence(String s, String t) {

        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();

        int sLength=0;
        int tLength=0;

        while(sLength<s1.length && tLength < t1.length){
            if(s1[sLength]==t1[tLength]){
                sLength++;
            }
            tLength++;

        }

        return sLength== s1.length;


    }
}
