/**
 * Created by adventure on 16/9/25.
 */
public class Is_Subsequence {
    public boolean isSubsequence(String s, String t) {
        int length1=s.length();
        int length2=t.length();
        if(length2<length1){
            return  false;
        }
        int pre=0;
        for(int i=0;i<length1;i++){
            char c=s.charAt(i);
            pre=t.indexOf(c,pre);
            if(pre<0){
                return false;
            }
            pre++;
        }
        return  true;
    }

    public static void main(String[] args) {
        Is_Subsequence test=new Is_Subsequence();
        System.out.println(test.isSubsequence("abc","afhdfhsjfhbjjjkc"));
    }
}
