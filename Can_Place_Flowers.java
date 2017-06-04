/**
 * Created by adventure on 2017/6/4.
 */
public class Can_Place_Flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        int length=flowerbed.length;
        int result=0;
        for(int i=0;i<length;i++){
            if(i==0){
                if(flowerbed[0]==0&&(i+1==length||flowerbed[i+1]!=1)){
                    flowerbed[0]=1;
                    result++;
                    i++;
                    if(result==n){
                        return true;
                    }
                }
            }else{
                if(flowerbed[i]==0&&(flowerbed[i-1]!=1)&&(i+1==length||flowerbed[i+1]!=1)){
                    flowerbed[i]=1;
                    result++;
                    if(result==n){
                        return true;
                    }
                    i++;
                }
            }
        }
        return result==n;
    }

    public static void main(String[] args) {
        Can_Place_Flowers test=new Can_Place_Flowers();
        int[] flowerbed={0,0,1,0,0};
        int n=1;
        System.out.println(test.canPlaceFlowers(flowerbed,n));
    }
}
