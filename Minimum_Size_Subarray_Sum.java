

/**
 * Created by yuanjianwei on 2015/7/2.
 */
public class Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int s, int[] nums) {
        int length=nums.length;
        if(length==0){
            return 0;
        }
        int start=0;
        int end=0;
        int sum=0;
        int result=Integer.MAX_VALUE;
        while(end<length){
            sum+=nums[end];
            if(sum<s){
                end++;
            }else{
                while(sum>=s){
                    sum-=nums[start];
                    start++;
                }
                if(end-start+2<result){
                    result=end-start+2;
                }
                end++;
            }
        }
        return result==Integer.MAX_VALUE?0:result;
    }

    public static void main(String[] args) {
        Minimum_Size_Subarray_Sum test=new Minimum_Size_Subarray_Sum();
        int[] A={2,3,2};
        System.out.println(test.minSubArrayLen(7,A));
    }
}
