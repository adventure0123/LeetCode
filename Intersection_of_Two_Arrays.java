import java.util.*;

/**
 * Created by adventure on 16/5/20.
 */
public class Intersection_of_Two_Arrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Boolean> map=new HashMap<>();
        if(nums1.length==0||nums2.length==0){
            return new int[0];
        }
        Set<Integer> set=new HashSet<>();
        for(int i=nums1.length-1;i>=0;i--){
            if(!map.containsKey(nums1[i])){
                map.put(nums1[i],true);
            }
        }
        for(int i=nums2.length-1;i>=0;i--){
            if(map.containsKey(nums2[i])){
                set.add(nums2[i]);
            }
        }
        int[] result=new int[set.size()];
        int i=0;
        for(Integer temp:set){
            result[i++]=temp;
        }
        return result;
    }

    public static void main(String[] args) {
        Intersection_of_Two_Arrays test=new Intersection_of_Two_Arrays();
        int[] num1={1,2,2,2};
        int[] num2={2,3};
        System.out.println(Arrays.toString(test.intersection(num1,num2)));
    }

}
