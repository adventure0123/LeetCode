

/**
 * Created by yuanjianwei on 2015/5/27.
 */
public class Plus_One {
    public int[] plusOne(int[] digits) {
        int length=digits.length;
        int carry_bit=1;
        int temp=0;
        for(int i=length-1;i>=0;i--){
            temp=carry_bit+digits[i];
            if(temp<10){
                digits[i]=temp;
                return digits;
            }else{
                carry_bit=1;
                digits[i]=temp-10;
            }
        }
        int[] result=new int[length+1];
        result[0]=1;
        for(int i=1;i<=length;i++){
            result[i]=digits[i-1];
        }
        return result;
    }
}
