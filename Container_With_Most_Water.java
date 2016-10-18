


/**
 * Created by yuanjianwei on 2015/5/18.
 */
public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        if (height.length == 0) {
            return 0;
        }
        int right_index = height.length - 1;
        int left_index = 0;
        int result = 0;
        int temp = 0;
        while (left_index < right_index) {
            if (height[left_index] > height[right_index]) {
                temp = height[right_index] * (right_index - left_index);
                right_index--;
            } else {
                temp = height[left_index] * (right_index - left_index);
                left_index++;
            }
            if (temp > result) {
                result = temp;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Container_With_Most_Water test = new Container_With_Most_Water();
        int[] height = {2, 1};
        System.out.println(test.maxArea(height));
    }
}
