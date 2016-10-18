

/**
 * Created by yuanjianwei on 2015/5/20.
 */
public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (val != nums[i]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {

    }
}
