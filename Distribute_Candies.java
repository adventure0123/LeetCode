import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by adventure on 2017/5/7.
 */
public class Distribute_Candies {
    public int distributeCandies(int[] candies) {
        if(candies==null||candies.length==0){
            return 0;
        }
        Set<Integer> set=new HashSet<>();
        int result=0;
        int size=candies.length/2;
        for(int i=0;i<candies.length;i++){
            if(!set.contains(candies[i])){
                result++;
                if(result>=size){
                    return result;
                }
                set.add(candies[i]);
            }
        }
        return result;
    }
}
