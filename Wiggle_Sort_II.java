import java.util.Arrays;

/**
 * Created by adventure on 16/4/12.
 */

//O(n) time O(n)space
public class Wiggle_Sort_II {
    public void wiggleSort(int[] nums) {
        int length=nums.length;
        if(nums.length<2){
            return;
        }
        Arrays.sort(nums);
        int[] result=new int[length];
        int mid = nums.length%2==0?nums.length/2-1:nums.length/2;
        int index = 0;
        for(int i=0;i<=mid;i++){
            result[index] = nums[mid-i];
            if(index+1<nums.length)
                result[index+1] = nums[nums.length-i-1];
            index = index+2;
        }
        for(int i=0;i<length;i++){
            nums[i]=result[i];
        }
        System.out.println(Arrays.toString(nums));

    }


    public static void main(String[] args){
        Wiggle_Sort_II test=new Wiggle_Sort_II();
        int[] nums={2,1,1,2,1,3,3,3,1,3,1,3,2};
        test.wiggleSort(nums);
    }
}
