import java.util.Arrays;

/**
 * Created by adventure on 16/4/14.
 */
public class Create_Maximum_Number {

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] result=new int[k];
        for(int i=0;i<=k;i++){
            if(k-i>nums2.length||i>nums1.length){
                continue;
            }
            int[] maxNum=mergeNum(getMaxNum(nums1,i),getMaxNum(nums2,k-i));
            if(compareNum(maxNum,result)){
                result =maxNum;
            }

        }
        return result;
    }
    private boolean compareNum(int[] nums1,int[] nums2){
        int length=nums1.length;
        for(int i=0;i<length;i++){
            if(nums2[i]>nums1[i]){
                return false;
            }else if(nums1[i]>nums2[i]){
                return  true;
            }
        }
        return false;
    }
    private int[] mergeNum(int[] nums1,int[] nums2){
        int[] result=new int[nums1.length+nums2.length];
        int i1=0;
        int i2=0;
        int i=0;
        for(i=0;i1<nums1.length&&i2<nums2.length;i++){
            if(nums1[i1]>nums2[i2]){
                result[i]=nums1[i1];
                i1++;
            }else if(nums1[i1]<nums2[i2]){
                result[i]=nums2[i2];
                i2++;
            }else{
                int index1=i1+1;
                int index2=i2+1;
                while(index1<nums1.length&&index2<nums2.length&&nums1[index1]==nums2[index2]){
                    index1++;
                    index2++;
                }

                if(index2==nums2.length||(index1<nums1.length&&nums1[index1]>nums2[index2])){
                    result[i]=nums1[i1];
                    i1++;
                }else{
                    result[i]=nums2[i2];
                    i2++;
                }

            }

        }
        while(i1<nums1.length){
            result[i]=nums1[i1];
            i++;
            i1++;
        }
        while(i2<nums2.length){
            result[i]=nums2[i2];
            i2++;
            i++;
        }
        return  result;

    }
    private int[] getMaxNum(int[] nums,int n){
        int[] result=new int[n];
        int index=0;
        int start=0;
        while(index<n){
            int temp=nums[start];
            for(int i=start+1;i<=nums.length-n+index;i++){
                if(nums[i]>temp){
                    temp=nums[i];
                    start=i;
                }
            }
            result[index]=temp;
            index++;
            start++;
        }
        return result;
    }

    public  static void main(String[] args){
        Create_Maximum_Number test=new Create_Maximum_Number();
        int[] nums1={7,6,1,9,3,2,3,1,1};
        int[] nums2={4,0,9,9,0,5,5,4,7};

        System.out.println(Arrays.toString(test.maxNumber(nums1,nums2,9)));
    }
}
