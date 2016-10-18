

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuanjianwei on 2015/7/1.
 */
public class Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map=new HashMap<>();
        int length1=s.length();
        int length2=t.length();
        if(length1!=length2){
            return false;
        }
        for(int i=0;i<length1;i++){
            if(!map.containsKey(s.charAt(i))){
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }else{
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
