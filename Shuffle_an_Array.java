import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by adventure on 16/8/21.
 */
public class Shuffle_an_Array {
    private int[] init;


    public Shuffle_an_Array(int[] nums) {
        init=nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return init;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int length=init.length;
        int[] nums= init.clone();

        Random random=new Random();
        for(int i=1;i<length;i++){
            int temp=random.nextInt(i+1);
            swap(nums,i,temp);
        }
        return nums;
    }

    private void  swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
