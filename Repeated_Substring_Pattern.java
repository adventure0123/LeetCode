/**
 * Created by adventure on 16/11/19.
 */
public class Repeated_Substring_Pattern {
    public boolean repeatedSubstringPattern(String str) {
        if(str==null){
            return false;
        }
        int length=str.length();
        if(length<=1){
            return false;
        }
        for(int i=1;i<=length/2;i++){
            if(length%i==0){
                String subStr=str.substring(0,i);
                StringBuffer sb=new StringBuffer();
                for(int j=0;j<length/i;j++){
                    sb.append(subStr);
                    if(!sb.toString().equals(str.substring(0,sb.length()))){
                        break;
                    }
                }
                if(str.equals(sb.toString())){
                    return true;
                }
            }
        }
       return false;
    }

    public static void main(String[] args) {
        Repeated_Substring_Pattern test=new Repeated_Substring_Pattern();
        String s="aabaa";
        System.out.println(test.repeatedSubstringPattern(s));
    }
}
