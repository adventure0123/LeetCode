import java.util.HashMap;
import java.util.Map;

/**
 * Created by adventure on 16/9/2.
 */
public class Find_the_Difference {
    public char findTheDifference(String s, String t) {
        int length=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<length;i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                int times=map.get(t.charAt(i));
                if(times==0){
                    return t.charAt(i);
                }else{
                    map.put(t.charAt(i),times-1);
                }
            }else{
                return t.charAt(i);
            }
        }
        return t.charAt(0);
    }
}
