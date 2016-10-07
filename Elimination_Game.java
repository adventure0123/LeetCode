/**
 * Created by adventure on 16/10/7.
 */
public class Elimination_Game {
    public int lastRemaining(int n) {
        int remainig=n;
        int head=1;
        int step=1;
        boolean flag=true;
        while(remainig>1){
            if(flag||remainig%2==1){
                head=head+step;
            }
            remainig=remainig/2;
            step=step*2;
            flag=!flag;
        }
        return head;
    }
}
