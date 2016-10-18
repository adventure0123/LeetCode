

/**
 * Created by yuanjianwei on 2015/7/8.
 */
public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int length=nums.length;
        if(length==0){
            return 0;
        }
        int start=0;
        int end=length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)>>1;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                start=mid+1;
            }

            if(nums[mid]>target){
                end=mid-1;
            }
        }
        System.out.println(mid);
        if(nums[mid]>target){
            return mid;
        }else{
            return mid+1;
        }
    }

    public static void main(String[] args) {
        Search_Insert_Position test=new Search_Insert_Position();
        int[] A={1,3,5,6};
        System.out.println(test.searchInsert(A,0));
    }
}
