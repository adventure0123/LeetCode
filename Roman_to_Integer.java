

/**
 * Created by yuanjianwei on 2015/5/19.
 */
public class Roman_to_Integer {

    public int romanToInt(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < s.length(); ) {
            if (i == s.length() - 1) {
                result += convertNum(s.charAt(i));
                return result;
            }
            int a = convertNum(s.charAt(i));
            int b = convertNum(s.charAt(i + 1));
            if (a < b) {
                result += b - a;
                i += 2;
            } else {
                result += a;
                i++;
            }
        }
        return result;
    }

    private int convertNum(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;

        }
    }

    public static void main(String[] args) {
        Roman_to_Integer test = new Roman_to_Integer();
        System.out.println(test.romanToInt("MCMXCVI"));
    }
}
