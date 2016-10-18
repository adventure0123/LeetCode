

import java.util.Stack;

/**
 * Created by yuanjianwei on 2015/6/25.
 */
public class Evaluate_Reverse_Polish_Notation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int length=tokens.length;
        for(int i=0;i<length;i++){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int second=stack.pop();
                int first=stack.pop();
                int temp=0;
                switch (tokens[i]){
                    case "+":
                        temp=first+second;
                        break;
                    case "-":
                        temp=first-second;
                        break;
                    case "*":
                        temp=first*second;
                        break;
                    case "/":
                        temp=first/second;
                        break;
                }
                stack.add(temp);
            }else{
                stack.add(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}
