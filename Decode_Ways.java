

/**
 * Created by yuanjianwei on 2015/6/5.
 */
public class Decode_Ways {
    public int numDecodings(String s) {
        int length = s.length();
        if (length == 0) {
            return 0;
        }
        int[] A = new int[length + 1];
        A[0] = 1;
        if (isValidation(s.substring(0, 1))) {
            A[1] = 1;
        } else {
            A[1] = 0;
        }
        for (int i = 1; i < length; i++) {
            if (isValidation(s.substring(i - 1, i + 1))) {
                A[i + 1] = A[i - 1];
            }
            if (isValidation(s.substring(i, i + 1))) {
                A[i + 1] += A[i];
            }
        }

        return A[length];
    }

    private boolean isValidation(String s) {
        if (s.charAt(0) == '0') {
            return false;
        }
        int num = Integer.parseInt(s);
        return num >= 1 && num <= 26;
    }

    public static void main(String[] args) {
        Decode_Ways test = new Decode_Ways();
        String s = "10";
        System.out.println(test.numDecodings(s));
    }
}
