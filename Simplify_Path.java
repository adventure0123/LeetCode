

import java.util.Stack;

/**
 * Created by yuanjianwei on 2015/5/28.
 */
public class Simplify_Path {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        if (path.length() == 0) {
            return path;
        }
        String[] paths = path.split("/");
        int length = paths.length;
        for (int i = 0; i < length; i++) {
            if (paths[i].equals("") || paths[i].equals(".")) {
                continue;
            } else if (paths[i].equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(paths[i]);
            }
        }
        StringBuffer result = new StringBuffer();
        int size = stack.size();
        if(size==0){
            return "/";
        }
        for (int i = 0; i < size; i++) {
            result.append("/");
            result.append(stack.get(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Simplify_Path test = new Simplify_Path();
        String path = "/..";
        System.out.println(test.simplifyPath(path));
    }
}
