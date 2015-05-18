/**
 * Created by yuanjianwei on 2015/5/18.
 */
public class ZigZag_Conversion {
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        int nRows = numRows * 2 - 2;
        StringBuffer[] T = new StringBuffer[numRows];
        for (int i = 0; i < numRows; i++) {
            T[i] = new StringBuffer();
        }
        for (int i = 0; i < s.length(); i++) {
            int temp = i % nRows;
            if (temp < numRows) {
                T[temp].append(s.charAt(i));
            } else {
                System.out.println(nRows - temp);
                T[nRows - temp].append(s.charAt(i));
            }
        }
        for (int i = 1; i < numRows; i++) {
            T[0].append(T[i]);
        }
        return T[0].toString();
    }

    public static void main(String[] args) {
        ZigZag_Conversion test = new ZigZag_Conversion();
        String s = "sdf";
        System.out.println(test.convert(s, 2));
    }
}
