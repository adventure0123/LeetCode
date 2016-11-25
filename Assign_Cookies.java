import java.util.Arrays;

/**
 * Created by adventure on 16/11/25.
 */
public class Assign_Cookies {
    public int findContentChildren(int[] g, int[] s) {
        int gSize=g.length;
        int sSize=s.length;
        if(gSize==0||sSize==0){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int result=0;
        for(int i=0,j=0;j<sSize&&i<gSize;){
            if(g[i]<=s[j]){
                result++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return result;
    }
}
