

/**
 * Created by yuanjianwei on 2015/5/28.
 */
public class Climbing_Stairs {
    public int climbStairs(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
       int[] A=new int[n];
        A[0]=1;
        A[1]=2;
        for(int i=2;i<n;i++){
            A[i]=A[i-1]+A[i-2];
        }
        return A[n-1];
    }
}
