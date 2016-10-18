

/**
 * Created by yuanjianwei on 2015/5/25.
 */
public class Kth_Largest_Element_in_an_Array {
    public int findKthLargest(int[] nums, int k) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int p = partition(nums, 0, length - 1);
        int start = 0;
        int end = length - 1;
        k = length - k;
        while (p != k) {
            if (p < k) {
                start = p + 1;
                p = partition(nums, p + 1, end);

            } else {
                end = p - 1;
                p = partition(nums, start, p - 1);

            }
        }

        return nums[p];
    }

    private int partition(int[] nums, int start, int end) {
        int i = start + 1;
        int j = end;
        if (i == j && nums[start] <= nums[end]) {
            return start;
        }
        while (i < j) {
            while (j>start&&nums[j] >= nums[start]) {
                j--;
            }
            while (i<end&&nums[i] <= nums[start]) {
                i++;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[j];
        nums[j] = nums[start];
        nums[start] = temp;
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {7,6,5,4,3,2,1};
        Kth_Largest_Element_in_an_Array test = new Kth_Largest_Element_in_an_Array();
        System.out.println(test.findKthLargest(nums, 2));
    }
}
