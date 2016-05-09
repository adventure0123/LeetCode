/**
 * Created by adventure on 16/5/9.
 */
public class Additive_Number {

    public boolean isAdditiveNumber(String num) {
        if(num==null||num.length()<3){
            return false;
        }
        int length=num.length();
        for(int i=1;i<=length/3;i++){
            for(int j=i+1;j<=length/3*2;j++){
                String s1=num.substring(0,i);
                String s2=num.substring(i,j);
                int start=j;
                int end=start+1;
                while(end<=length){
                    end=start+((s1.length()>s2.length())?s1.length():s2.length());
                    if(end<=length&&isequal(s1,s2,num.substring(start,end))){

                    }else if(end+1<=length&&isequal(s1,s2,num.substring(start,end+1))){
                        end=end+1;
                    }else {
                        break;
                    }
                    s1=s2;
                    s2=num.substring(start,end);
                    start=end;
                    if(end==length){
                        return true;
                    }
                }

            }
        }
        return false;
    }

    private  boolean isequal(String s1,String s2,String s3){
        s1=new StringBuilder(s1).reverse().toString();
        s2=new StringBuilder(s2).reverse().toString();
        if((s1.indexOf(s1.length()-1)=='0'&&s1.length()>1)
                ||(s2.indexOf(s2.length()-1)=='0'&&s2.length()>1)||
                (s3.indexOf(s3.length()-1)=='0'&&s3.length()>1)){
            return false;
        }
        StringBuilder temp=new StringBuilder();
        int sum=0;
        int carry=0;
        int length1=s1.length();
        int length2=s2.length();
        int i=0;
        for(;i<length1&&i<length2;i++){
            sum=carry+s1.charAt(i)-'0'+s2.charAt(i)-'0';
            carry=sum/10;
            sum=sum%10;
            temp.append(sum);
        }
        for(;i<length1;i++){
            sum=carry+s1.charAt(i)-'0';
            carry=sum/10;
            sum=sum%10;
            temp.append(sum);
        }
        for(;i<length2;i++){
            sum=carry+s2.charAt(i)-'0';
            carry=sum/10;
            sum=sum%10;
            temp.append(sum);
        }
        if(carry!=0){
            temp.append(carry);
        }
        temp.reverse();
        return  s3.equals(temp.toString());
    }

    public static void main(String[] args) {
        Additive_Number test=new Additive_Number();
        String s1="99";
        String s2="100";
        String s3="199";
        //System.out.println(test.isequal(s1,s2,s3));
        String num="11238";
        System.out.println(test.isAdditiveNumber(num));
    }

}
