

import java.util.*;

/**
 * Created by yuanjianwei on 2015/6/29.
 */
public class Largest_Number {
    public String largestNumber(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int length=nums.length;
        for(int i=0;i<length;i++){
            list.add(nums[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1=o1.toString()+o2.toString();
                String s2=o2.toString()+o1.toString();
                int size=s1.length();
                for(int i=0;i<size;i++){
                    if(s1.charAt(i)<s2.charAt(i)){
                        return 1;
                    }else if(s1.charAt(i)>s2.charAt(i)){
                        return -1;
                    }
                }
                return 0;
            }
        });
        if(list.get(0)==0){
            return "0";
        }
        StringBuffer bf=new StringBuffer();
        for(int i=0;i<length;i++) {
            bf.append(list.get(i));
        }
        return bf.toString();
    }

    public static void main(String[] args) {
        Largest_Number test=new Largest_Number();
        int[] A={999999998,999999997,999999999};
        System.out.println(test.largestNumber(A));
    }
}
