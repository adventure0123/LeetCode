/**
 * Created by adventure on 16/4/18.
 */
public class Power_of_Four {
    public boolean isPowerOfFour(int num) {
        return num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) != 0;
    }

    public static void main(String[] args) {
        Power_of_Four test = new Power_of_Four();
        System.out.println(test.isPowerOfFour(1));
    }
}
