/**
 * Created by adventure on 16/7/15.
 */
public class Guess_Number_Higher_or_Lower extends GuessGame{
    public int guessNumber(int n) {
        int start=1;
        int mid=(n-start)/2+start;
        int temp=guess(mid);
        while(temp!=0){
            if(temp==-1){
                n=mid-1;
            }else if(temp==1){
                start=mid+1;
            }
            mid=(n-start)/2+start;
            temp=guess(mid);
        }
        return mid;
    }
}
