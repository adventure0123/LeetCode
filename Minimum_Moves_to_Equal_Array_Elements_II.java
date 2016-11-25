import java.util.Arrays;

/**
 * Created by adventure on 16/11/25.
 */
public class Minimum_Moves_to_Equal_Array_Elements_II {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int length=nums.length;
        int mid=nums[length/2];
        int result=0;
        for(int i=0;i<length;i++){
            result+=Math.abs(nums[i]-mid);
        }
        return result;
    }
}
