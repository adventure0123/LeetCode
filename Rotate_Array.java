package com.LeetCode;

/**
 * Created by yuanjianwei on 2015/6/29.
 */
public class Rotate_Array {
    public void rotate(int[] nums, int k) {
        int length=nums.length;
        k=k%length;
        int i=length-k;
        int j=length-1;
        int temp;
        while(i<j){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        i=0;
        j=length-k-1;
        while(i<j){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        i=0;
        j=length-1;
        while(i<j){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

    }
}
