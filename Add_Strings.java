/**
 * Created by adventure on 16/10/29.
 */
public class Add_Strings {
    public String addStrings(String num1, String num2) {
        StringBuffer result=new StringBuffer();
        StringBuffer s1=new StringBuffer(num1);
        StringBuffer s2=new StringBuffer(num2);
        s1.reverse();
        s2.reverse();
        int sum=0;
        int bit=0;
        int i=0;
        for(;i<s1.length()&&i<s2.length();i++){
            sum=s1.charAt(i)-'0'+s2.charAt(i)-'0'+bit;
            bit=sum/10;
            result.append(sum%10);
        }
        while(i<s1.length()){
            sum=bit+s1.charAt(i)-'0';
            bit=sum/10;
            result.append(sum%10);
            i++;
        }
        while (i<s2.length()){
            sum=bit+s2.charAt(i)-'0';
            bit=sum/10;
            result.append(sum%10);
            i++;
        }
        if(bit!=0){
            result.append(bit);
        }
        return result.reverse().toString();
    }
}
