/**
 * Created by adventure on 16/11/12.
 */
public class Minimum_Moves_to_Equal_Array_Elements {
    public int minMoves(int[] nums) {
        int length=nums.length;
        if(length<=1){
            return 0;
        }
        int minNum=nums[0];
        for(int i=1;i<length;i++){
            if(nums[i]<minNum){
                minNum=nums[i];
            }
        }
        int result=0;
        for(int i=0;i<length;i++){
            result+=nums[i]-minNum;
        }
        return result;
    }
}
