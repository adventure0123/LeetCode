import java.util.HashMap;
import java.util.Map;

/**
 * Created by adventure on 16/10/8.
 */
public class Longest_Substring_with_At_Least_K_Repeating_Characters {

    public int longestSubstring(String s, int k) {
        if(s==null||s.length()==0){
            return 0;
        }
        Map<Character,Integer> map=new HashMap<>();
        int length=s.length();
        for(int i=0;i<length;i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        int num=0;
        for(Character ch:map.keySet()){
            if(map.get(ch)>=k){
                num+=map.get(ch);
            }
        }
        return num;
    }
}
