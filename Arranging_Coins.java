/**
 * Created by adventure on 16/11/3.
 */
public class Arranging_Coins {
    public int arrangeCoins(int n) {
        if(n<=0){
            return 0;
        }
        int i=1;
        while(n>=0){
            n=n-i;
            i++;
        }
        return i-2;
    }

    public static void main(String[] args) {
        Arranging_Coins test=new Arranging_Coins();
        System.out.println(test.arrangeCoins(8));
    }
}
