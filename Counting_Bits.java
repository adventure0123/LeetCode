

import java.util.Arrays;

/**
 * Created by jianweiyuan on 16/4/1.
 */
public class Counting_Bits {
    public int[] countBits(int num) {
        int [] result=new int[num+1];
        result[0]=0;

        for(int i=1;i<=num;i++){
            int n=(int)Math.floor(Math.log(i)/ Math.log(2));
            //System.out.println(n);
            result[i]=1+result[i-(int)Math.pow(2,n)];
        }
        //System.out.println(Arrays.toString(result));
        return result;
    }
    public static void main(String[] args) {
        Counting_Bits test=new Counting_Bits();
        test.countBits(8);
    }
}
