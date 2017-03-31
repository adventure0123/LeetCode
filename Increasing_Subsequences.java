import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by adventure on 2017/3/31.
 */
public class Increasing_Subsequences {
    public List<List<Integer>> findSubsequences(int[] nums) {
        if(nums==null||nums.length==0){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        addSuquence(nums,0,temp,result);

        return result;
    }

    private void addSuquence(int[] nums,int start,List<Integer> sequence,List<List<Integer>> result){
        if(sequence.size()>1) {
            result.add(new ArrayList<Integer>(sequence));
        }
        List<Integer> unique = new ArrayList<Integer>();
        for(int i=start;i<nums.length;i++){
            if(start>0&&nums[i]<nums[start-1]){
                continue;
            }
            if (unique.contains(nums[i])) continue; // skip duplicate
            unique.add(nums[i]);
            sequence.add(nums[i]);
            addSuquence(nums,i+1,sequence,result);
            sequence.remove(sequence.size()-1);

        }

    }

    public static void main(String[] args) {
        Increasing_Subsequences test=new Increasing_Subsequences();
        int[] nums={1,10,1,1};
        System.out.println(test.findSubsequences(nums));
    }
}
