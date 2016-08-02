import java.util.Arrays;

/**
 * Created by adventure on 16/8/2.
 */
public class Combination_Sum_IV {
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        int[] result=new int[target+1];
        int length=nums.length;
        for(int i=1;i<=target;i++){
            for(int j=0;j<length;j++){
                if(nums[j]>i){
                    break;
                }else if(nums[j]==i){
                    result[i]++;
                }else{
                    result[i]+=result[i-nums[j]];
                }
            }
        }
        return result[target];
    }

    public static void main(String[] args) {
        Combination_Sum_IV test=new Combination_Sum_IV();
        int[] nums={1, 2, 3};
        System.out.println(test.combinationSum4(nums,4));
    }
}
