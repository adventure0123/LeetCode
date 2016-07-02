/**
 * Created by adventure on 16/7/2.
 */
public class Water_and_Jug_Problem {
    public boolean canMeasureWater(int x, int y, int z) {
        int min=Integer.min(x,y);

        if(x==z||y==z){
            return true;
        }
        if(z>x+y){
            return false;
        }
        if(x==0||y==0){
            return false;
        }
        int n=-1;
        for(int i=1;i<=min;i++){
            if(x%i==0&&y%i==0){
                n=i;
            }
        }
        //System.out.println(n);
        if(n==1){
            return  true;
        }

        return  z%n==0;
    }

    public static void main(String[] args) {
        Water_and_Jug_Problem test=new Water_and_Jug_Problem();
        System.out.println(test.canMeasureWater(0,2,1));
    }
}
