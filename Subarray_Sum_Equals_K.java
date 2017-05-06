import java.util.HashMap;
import java.util.Map;

/**
 * Created by adventure on 2017/5/6.
 */
public class Subarray_Sum_Equals_K {

    public int subarraySum(int[] nums, int k) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int length=nums.length;
        int result=0;
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,1);
        for(int i=0;i<length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                result+=map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else {
                map.put(sum,1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Subarray_Sum_Equals_K test=new Subarray_Sum_Equals_K();
        int[] nums={1,-1,1,1,1};
        System.out.println(test.subarraySum(nums,2));
    }
}
