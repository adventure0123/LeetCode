import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by adventure on 16/6/30.
 */
public class Largest_Divisible_Subset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result=new LinkedList<>();
        if(nums.length==0){
            return result;
        }
        Arrays.sort(nums);
        int[] temp=new int[nums.length];
        temp[0]=1;
        int[] path=new int[nums.length];
        path[0]=-1;
        int max=0;
        int maxIndex=0;
        for(int i=1;i<nums.length;i++){
            path[i]=-1;
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0){
                    temp[i]=temp[j]+1;
                    path[i]=j;
                    if(temp[i]>max){
                        max=temp[i];
                        maxIndex=i;
                    }

                }
            }
        }
        while(maxIndex!=-1){
            result.add(nums[maxIndex]);
            maxIndex=path[maxIndex];
        }
        return result;
    }

    public static void main(String[] args) {
        Largest_Divisible_Subset test=new Largest_Divisible_Subset();
        int[] nums={1};
        System.out.println(test.largestDivisibleSubset(nums));
    }
}
