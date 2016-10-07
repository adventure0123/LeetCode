

import java.util.*;

/**
 * Created by adventure on 16/10/7.
 */
public class Longest_Palindrome {

    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        if(s==null||s.length()==0){
            return 0;
        }
        int length=s.length();
        for(int i=0;i<length;i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        int num=0;
        int odd=0;
        for(Character c:map.keySet()){
            if(map.get(c)%2==1){
                odd=1;
            }
            num+=map.get(c)/2*2;
        }
        return num+odd;
    }
}
