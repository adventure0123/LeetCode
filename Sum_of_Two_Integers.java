/**
 * Created by adventure on 16/6/30.
 */
public class Sum_of_Two_Integers {
    public int getSum(int a, int b) {
        int result=a^b;
        int sum=a&b;
        sum=sum<<1;
        while(sum!=0){

            int temp=result^sum;
            sum=result&sum;
            result=temp;
            sum=sum<<1;
        }
        return result;
    }

    public static void main(String[] args) {
        Sum_of_Two_Integers test=new Sum_of_Two_Integers();
        System.out.println(test.getSum(-1,4));
    }
}
