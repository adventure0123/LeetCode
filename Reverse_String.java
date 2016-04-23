/**
 * Created by adventure on 16/4/23.
 */
public class Reverse_String {
    public String reverseString(String s) {
        if(s==null){
            return  s;
        }
        int length=s.length();
        if(length==0){
            return s;
        }
        StringBuilder result=new StringBuilder();
        for(int i=length-1;i>=0;i--){
            result.append(s.charAt(i));
        }

        return result.toString();
    }
    public static void main(String[] args) {

    }
}
