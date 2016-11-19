/**
 * Created by adventure on 16/11/19.
 */
public class Repeated_Substring_Pattern {
    public boolean repeatedSubstringPattern(String str) {
        if(str==null){
            return false;
        }
        int length=str.length();
        if(length<=1){
            return false;
        }
        char c=str.charAt(0);
        int index=1;
        for(int i=0;i<length;i++){
            if(str.charAt(i)==c){
                index=i;
                break;
            }
        }
        int subLength=index;
        if(length%(index-1)!=0){
            return false;
        }
        String subStr=str.substring(index);
        StringBuffer sb=new StringBuffer();
        int times=length/(index-1)
        for(int i=0;i<)
        return false;
    }
}
