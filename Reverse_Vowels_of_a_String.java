/**
 * Created by adventure on 16/4/23.
 */
public class Reverse_Vowels_of_a_String {
    public String reverseVowels(String s) {
        if(s==null||s.length()<=1){
            return s;
        }
        char[] result=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j&&!isVowels(result[i])){
                i++;
            }
            while(i<j&&!isVowels(result[j])){
                j--;
            }
            char temp=result[i];
            result[i]=result[j];
            result[j]=temp;
            i++;
            j--;
        }
        return new String(result);
    }
    private boolean isVowels(char c){
        c=Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        Reverse_Vowels_of_a_String test=new Reverse_Vowels_of_a_String();
        String s="LEETCODE";
        System.out.println(test.reverseVowels(s));
    }
}
