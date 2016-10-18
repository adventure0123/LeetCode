

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanjianwei on 2015/6/29.
 */
//Moore Voting
public class Majority_Element_II {
    public List<Integer> majorityElement(int[] nums) {
        int m=0,n=0;
        int countm=0,countn=0;
        int length=nums.length;
        for(int i=0;i<length;i++){
            if(countm==0){
                m=nums[i];
                countm++;
            }else if(m==nums[i]){
                countm++;
            }
            else if(countn==0){
                n=nums[i];
                countn++;
            }else if(n==nums[i]){
                countn++;
            }else{
                countm--;
                countn--;
            }
        }
        countm=0;
        countn=0;

        for(int i=0;i<length;i++){
            if(nums[i]==m){
                countm++;
            }else if(nums[i]==n){
                countn++;
            }
        }
       // System.out.println(m+"  "+n);
        List<Integer> result=new ArrayList<>();
        if(countm>length/3){
            result.add(m);
        }
        if(countn>length/3){
            result.add(n);
        }
        return result;
    }

    public static void main(String[] args) {
        Majority_Element_II test=new Majority_Element_II();
        int[] A={8,8,7,7,7};
        System.out.println(test.majorityElement(A).toString());
    }
}
