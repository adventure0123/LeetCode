/**
 * Created by adventure on 16/6/15.
 */
public class Count_Numbers_with_unique_Digits {

    public int countNumberWithUniqueDigits(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 10;
        }
        if(n>10){
            return  countNumberWithUniqueDigits(10);
        }
        int temp=countNumberWithUniqueDigits(n-1);
        return (temp-countNumberWithUniqueDigits(n-2))*(10-n+1)+temp;
    }

    public static void main(String[] args) {
        Count_Numbers_with_unique_Digits test=new Count_Numbers_with_unique_Digits();
        System.out.println(test.countNumberWithUniqueDigits(9));
    }
}
