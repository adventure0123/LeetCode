

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by adventure on 2017/5/4.
 */
public class Permutation_in_String {

    public boolean checkInclusion(String s1, String s2) {
        if(s1==null||s1.length()==0){
            return true;
        }
        if(s2==null||s2.length()==0){
            return false;
        }
        if(s1.length()>s2.length()){
            return false;
        }
        int size=s1.length();
        char[] ch1=new char[26];
        for(int i=0;i<s1.length();i++){
            ch1[s1.charAt(i)-'a']++;
        }
        char[] ch2=new char[26];
        int j=0;
        for(;j<s1.length();j++){
            ch2[s2.charAt(j)-'a']++;
        }
        if(compareChar(ch1,ch2)){
            return true;
        }
        for(;j<s2.length();j++){
            ch2[s2.charAt(j)-'a']++;
            ch2[s2.charAt(j-size)-'a']--;
            if(compareChar(ch1,ch2)){
                return true;
            }
        }

        return false;
    }

    private boolean compareChar(char[] ch1,char[] ch2){
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                return  false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Permutation_in_String test=new Permutation_in_String();
        System.out.println(test.checkInclusion("adc","dcda"));
    }

}
