/**
 * Created by adventure on 16/6/26.
 */
public class Valid_Perfect_Square {
    public boolean isPerfectSquare(int num) {
      if(num<0){
          return false;
      }
        if(num==0||num==1){
            return true;
        }
        int left=1;
        int right=num;
        while (left<=right){
            long mid=(left+right)/2;
            //System.out.println(mid);
            if(mid*mid>num){
                right= (int) (mid-1);
            }else  if(mid*mid<num){
                left= (int) (mid+1);
            }else {
                return  true;
            }
        }
      return false;
    }
    public static void main(String[] args) {
        Valid_Perfect_Square test=new Valid_Perfect_Square();
        System.out.println(test.isPerfectSquare(104976));
    }
}
