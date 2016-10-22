import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by adventure on 16/10/22.
 */
public class Third_Maximum_Number {

    public int thirdMax(int[] nums) {
        int length=nums.length;
        if(length==1){
            return nums[0];
        }
        if (length==2){
            return nums[0]>nums[1]?nums[0]:nums[1];
        }

        long first=nums[0];
        long second=Long.MIN_VALUE;
        long third=second;
        for(int i=1;i<length;i++){
           if(nums[i]<=third||nums[i]==second||nums[i]==first){
               continue;
           }
           if(nums[i]>third&&nums[i]<second){
               third=nums[i];
               continue;
           }
           if(nums[i]>second&&nums[i]<first){
               third=second;
               second=nums[i];
               continue;
           }
            if(nums[i]>first){
                third=second;
                second=first;
                first=nums[i];
            }

        }
        //System.out.println(third);
        if(third==Long.MIN_VALUE){
            return (int) first;
        }else {
            return (int) third;
        }

    }

    public static void main(String[] args) {
        Third_Maximum_Number test=new Third_Maximum_Number();
        int[] nums={3,2,1};
        System.out.println(test.thirdMax(nums));
    }
}
