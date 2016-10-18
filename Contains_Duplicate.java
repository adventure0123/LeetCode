

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuanjianwei on 2015/5/25.
 */
public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        int length=nums.length;
        if (length==0){
            return false;
        }
        Map<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],true);
            }else{
                return true;
            }
        }
        return false;
    }


}
