

import java.util.Arrays;

/**
 * Created by yuanjianwei on 2015/5/28.
 */
//dynamic programming
public class Edit_Distance {
    public int minDistance(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        if (length1 == 0) {
            return length2;
        }
        if (length2 == 0) {
            return length1;
        }
        int[][] A = new int[length1 + 1][length2 + 1];
        for (int i = 0; i <= length1; i++) {
            A[i][0] = i;
        }
        for (int i = 0; i <= length2; i++) {
            A[0][i] = i;
        }
        int temp;
        for (int i = 1; i <= length1; i++) {
            for (int j = 1; j <= length2; j++) {
                temp = Math.min(A[i - 1][j], A[i][j - 1]);
                //System.out.println(temp);
                if (A[i - 1][j - 1] <= temp) {
                    A[i][j] = word1.charAt(i - 1) == word2.charAt(j - 1) ? A[i - 1][j - 1] : A[i - 1][j - 1] + 1;
                } else {
                    A[i][j] = temp + 1;
                }
            }
        }
        return A[length1][length2];
    }

    public static void main(String[] args) {
        Edit_Distance test=new Edit_Distance();
        String wordl="ab";
        String word2="";
        System.out.println(test.minDistance(wordl,word2));
    }
}
