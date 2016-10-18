

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuanjianwei on 2015/7/1.
 */
public class Happy_Number {
    public boolean isHappy(int n) {
        Map<Integer,Boolean> map=new HashMap<>();
        map.put(n,true);
        int sum=0,bit;
        while(n!=1){
            sum=0;
           while(n!=0){
               bit=n%10;
               n=n/10;
               sum=sum+bit*bit;
           }
            if(sum==1){
                return true;
            }else if(map.containsKey(sum)){
                return false;
            }else{
                map.put(sum,true);
                n=sum;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Happy_Number test=new Happy_Number();
        System.out.println(test.isHappy(19));
    }
}
