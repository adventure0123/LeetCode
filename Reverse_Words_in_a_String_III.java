/**
 * Created by adventure on 2017/4/28.
 */
public class Reverse_Words_in_a_String_III {
    public String reverseWords(String s) {
        if(s==null||s.length()==0){
            return s;
        }
        String[] temps=s.split(" ");
        StringBuffer result=new StringBuffer();
        for(int i=0;i<temps.length;i++){
            StringBuffer temp=new StringBuffer(temps[i]);
            if(i==0){
                result.append(temp.reverse());
            }else{
                result.append(" ").append(temp.reverse());
            }

        }
        return result.toString();
    }
}
