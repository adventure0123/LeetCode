import java.util.HashMap;
import java.util.Map;

/**
 * Created by adventure on 2017/5/21.
 */
public class Longest_Harmonious_Subsequence {

    public int findLHS(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        int result=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            Integer key=entry.getKey();
            Integer value=entry.getValue();
            if(map.containsKey(key-1)){
                if(value+map.get(key-1)>result){
                    result=value+map.get(key-1);
                }
            }
            if(map.containsKey(key+1)){
                if(value+map.get(key+1)>result){
                    result=value+map.get(key+1);
                }
            }

        }
        return result;
    }
}
