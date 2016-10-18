

/**
 * Created by yuanjianwei on 2015/5/26.
 */
public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int length=nums.length;
        if(length==0){
            return 0;
        }
        int max=Integer.MIN_VALUE>>1;
        int temp=max;
        for(int i=0;i<length;i++){
            if(temp+nums[i]<nums[i]){
                temp=nums[i];
            }else{
                temp+=nums[i];
            }
            if(temp>max){
                max=temp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Maximum_Subarray test=new Maximum_Subarray();
        int[] A={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(test.maxSubArray(A));
    }
}
