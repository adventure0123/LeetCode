import java.util.HashMap;
import java.util.Map;

/**
 * Created by adventure on 16/8/27.
 */
public class First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        if(s==null||s.length()==0){
            return -1;
        }
        Map<Character,Integer> map=new HashMap<>();
        int length=s.length();
        for(int i=0;i<length;i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),-1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<length;i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
