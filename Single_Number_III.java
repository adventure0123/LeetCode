import java.util.Arrays;

/**
 * Created by jianweiyuan on 16/4/7.
 */
public class Single_Number_III {
    public int[] singleNumber(int[] nums) {
        int a=0;
        int b=0;
        int xab=0;
        int length=nums.length;
        for(int i=0;i<length;i++){
            xab^=nums[i];
        }
        xab=xab&(-xab);
        for(int i=0;i<length;i++){
            if((xab&nums[i])==0){
                a^=nums[i];
            }else {
                b^=nums[i];
            }
        }
        return new int[]{a,b};
    }

    public static void main(String[] args){
        Single_Number_III test=new Single_Number_III();
        int[] nums={1,1,2,2,3,4};
        System.out.print(Arrays.toString(test.singleNumber(nums)));
    }

}
