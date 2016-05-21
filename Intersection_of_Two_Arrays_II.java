import java.util.*;

/**
 * Created by adventure on 16/5/22.
 */
public class Intersection_of_Two_Arrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }
        for (int i = nums2.length - 1; i >= 0; i--) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                map.put(nums2[i], map.get(nums2[i])-1);
                list.add(nums2[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = list.size() - 1; i >= 0; i--) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Intersection_of_Two_Arrays_II test=new Intersection_of_Two_Arrays_II();
        int[] num1={1};
        int[] num2={1,1};
        System.out.println(Arrays.toString(test.intersect(num1,num2)).toString());
    }
}
