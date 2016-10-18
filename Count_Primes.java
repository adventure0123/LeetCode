

/**
 * Created by yuanjianwei on 2015/7/1.
 */
public class Count_Primes {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }
        boolean[] A=new boolean[n];
        int temp;
        for(int i=2;i<Math.sqrt(n);i++){
            if(!A[i]) {
                for (int j = i; i * j < n; j++) {
                    A[i*j]=true;
                }
            }
        }
        int sum=0;
        for(int i=2;i<n;i++){
            if(!A[i]){
                sum++;
            }
        }
        return sum;
    }
}
