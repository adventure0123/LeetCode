import java.util.Stack;

/**
 * Created by yuanjianwei on 2015/5/18.
 */
public class Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        if (length == 0) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                stack.add(s.charAt(i));
            } else {
                char temp = s.charAt(i);
                if (temp == '(' || temp == '[' || temp == '{') {
                    stack.add(temp);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char c = stack.pop();
                    switch (temp) {
                        case ')':
                            if (c != '(') {
                                return false;
                            }
                            break;
                        case '}':
                            if (c != '{') {
                                return false;
                            }
                            break;
                        case ']':
                            if (c != '[') {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }

                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Valid_Parentheses test = new Valid_Parentheses();
        String s = "[])";
        System.out.println(test.isValid(s));
    }
}
