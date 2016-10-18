import java.util.Arrays;

/**
 * Created by adventure on 16/10/18.
 */
public class Partition_Equal_Subset_Sum {
    public boolean canPartition(int[] nums) {
        int length=nums.length;
        int sum=0;
        if(length<=1){
            return false;
        }
        if(length==2){
            return nums[0]==nums[1];
        }
        for(int i=0;i<length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return  false;
        }
        sum=sum/2;
        boolean[] p=new boolean[sum+1];
        p[0]=true;
        for(int i=0;i<length;i++){
            for(int j = sum; j >= nums[i] ; --j)
                p[j] = p[j] || p[j - nums[i]];
        }
        return p[sum];
    }

    public static void main(String[] args) {
        Partition_Equal_Subset_Sum test=new Partition_Equal_Subset_Sum();
        int[] nums={1,2,5};
        System.out.println(test.canPartition(nums));
    }
}
