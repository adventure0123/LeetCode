/**
 * Created by adventure on 16/6/15.
 */
public class Count_Numbers_with_unique_Digits {

    public int countNumbersWithUniqueDigits(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 10;
        }
        if(n>10){
            return  countNumbersWithUniqueDigits(10);
        }
        int temp=countNumbersWithUniqueDigits(n-1);
        return (temp-countNumbersWithUniqueDigits(n-2))*(10-n+1)+temp;
    }

    public static void main(String[] args) {
        Count_Numbers_with_unique_Digits test=new Count_Numbers_with_unique_Digits();
        System.out.println(test.countNumbersWithUniqueDigits(9));
    }
}
