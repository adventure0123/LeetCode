

/**
 * Created by yuanjianwei on 2015/7/8.
 */
public class Count_and_Say {
    public String countAndSay(int n) {
        if(n==0){
            return "";
        }
        StringBuffer result=new StringBuffer();
        result.append(1);
        for(int i=2;i<=n;i++){
            int length=result.length();
            int count=1;
            for(int j=0;j<length;j++) {
                if (j + 1 < length && result.charAt(0) == result.charAt(1)) {
                    count++;
                } else {
                    result.append(count);
                    result.append(result.charAt(0));
                    count = 1;
                }
                result.delete(0, 1);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Count_and_Say test=new Count_and_Say();
        System.out.println(test.countAndSay(25));
    }
}
