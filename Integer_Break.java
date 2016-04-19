/**
 * Created by adventure on 16/4/19.
 */
public class Integer_Break {
    public int integerBreak(int n) {
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        int[] temp=new int[n+1];
        temp[1]=1;
        temp[2]=2;
        int max=0;
        for(int i=3;i<=n;i++){
            max=i;
            for(int j=1;j<=i/2;j++){
                //System.out.println(i-j);
                if(j*temp[i-j]>max){
                    max=j*temp[i-j];
                }
            }
            //System.out.println(max);
            temp[i]=max;
        }
        return temp[n];
    }

    public static void main(String[] args) {
        Integer_Break test=new Integer_Break();
        System.out.println(test.integerBreak(10));
    }
}
