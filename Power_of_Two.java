

/**
 * Created by yuanjianwei on 2015/7/6.
 */
public class Power_of_Two {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n>0) {
            int temp = 2;
            while (temp <= n) {
                if (temp == n) {
                    return true;
                }
                if (temp >= (Integer.MAX_VALUE >> 1)) {
                    return false;
                }
                temp = temp << 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Power_of_Two test=new Power_of_Two();
        System.out.println(test.isPowerOfTwo(-8));
    }
}
