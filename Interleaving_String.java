

import java.util.Arrays;

/**
 * Created by yuanjianwei on 2015/6/12.
 */
public class Interleaving_String {
    public boolean isInterleave(String s1, String s2, String s3) {
        int length1 = s1.length();
        int length2 = s2.length();
        int length3 = s3.length();
        if (length1 + length2 != length3) {
            return false;
        }
        if (s1.equals("")) {
            return s2.equals(s3);
        }
        if (s2.equals("")) {
            return s1.equals(s3);
        }
        boolean[][] A = new boolean[length1 + 1][length2 + 1];
        A[0][0] = true;
        for (int i = 1; i < length1 + 1; i++) {
            if (A[i - 1][0] && s3.charAt(i - 1) == s1.charAt(i - 1)) {
                A[i][0] = true;
            }
        }
        for (int j = 1; j < length2 + 1; j++) {
            if (A[0][j - 1] && s3.charAt(j - 1) == s2.charAt(j - 1)) {
                A[0][j] = true;
            }
        }
        System.out.println(Arrays.toString(A[0]));
        for (int i = 1; i < length1 + 1; i++) {
            for (int j = 1; j < length2 + 1; j++) {
                if (A[i][j - 1] && s3.charAt(i + j - 1) == s2.charAt(j - 1)) {
                    A[i][j] = true;
                }
                if (A[i - 1][j] && s3.charAt(i + j - 1) == s1.charAt(i - 1)) {
                    A[i][j] = true;
                }
            }
        }
        return A[length1][length2];
    }

    public static void main(String[] args) {
        Interleaving_String test = new Interleaving_String();
        String s1 = "aa";
        String s2 = "ab";
        String s3 = "abaa";
        System.out.println(test.isInterleave(s1, s2, s3));
    }
}
