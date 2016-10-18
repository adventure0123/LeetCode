

/**
 * Created by yuanjianwei on 2015/5/18.
 */
public class Longest_Common_Prefix {

    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return strs[0];
        }
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < length; j++) {
                if (i >= strs[j].length() || c != strs[j].charAt(i)) {
                    return result.toString();
                }
            }
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] str = {"ab", "abc", "a"};
        Longest_Common_Prefix test = new Longest_Common_Prefix();
        System.out.println(test.longestCommonPrefix(str));
    }
}
