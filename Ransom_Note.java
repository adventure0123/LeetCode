import java.util.*;

/**
 * Created by adventure on 16/8/21.
 */
public class Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()==0){
            return true;
        }
        if(magazine.length()==0){
            return false;
        }
        int length=magazine.length();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<length;i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
            }else {
                map.put(magazine.charAt(i),1);
            }
        }
        length=ransomNote.length();
        for(int i=0;i<length;i++){
            if(map.containsKey(ransomNote.charAt(i))){
                int temp=map.get(ransomNote.charAt(i));
                temp--;
                if(temp<0){
                    return false;
                }
                map.put(ransomNote.charAt(i),temp);
            }else {
                return false;
            }
        }
        return true;
    }
}
