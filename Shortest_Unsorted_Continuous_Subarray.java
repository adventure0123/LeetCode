/**
 * Created by adventure on 2017/5/25.
 */
public class Shortest_Unsorted_Continuous_Subarray {
    public int findUnsortedSubarray(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int start=nums.length;
        int end=0;
        int max=nums[0];
        int result=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<max){
                end=i;

                    for(int j=0;j<nums.length&j<start;j++){
                        if(nums[i]<nums[j]){
                            start=j;
                            break;
                        }

                }
                result=end-start+1;
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Shortest_Unsorted_Continuous_Subarray test=new Shortest_Unsorted_Continuous_Subarray();
        int[] nums={2,3,3,2,5};
        System.out.println(test.findUnsortedSubarray(nums));
    }
}
