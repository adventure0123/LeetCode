import java.util.Stack;

/**
 * Created by adventure on 16/10/7.
 */
public class Decode_String {
    public String decodeString(String s) {
        if(s==null||s.length()==0){
            return "";
        }
        int start=s.lastIndexOf('[');
        int end=0;
        if(start==-1){
            return s;
        }
        for(int j=start;j<s.length();j++){
            if(s.charAt(j)==']'){
                end=j;
                break;
            }
        }

        int i=start-1;
        StringBuffer tempNum=new StringBuffer();
        while(i>=0){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                tempNum.append(s.charAt(i));
            }else{
                break;
            }
            i--;
        }
        tempNum=tempNum.reverse();
        int num=Integer.parseInt(tempNum.toString());
        String temp=s.substring(start+1,end);
        StringBuffer sb=new StringBuffer();
        for(int j=0;j<num;j++){
            sb.append(temp);
        }


        return decodeString(s.substring(0,i+1)+sb.toString()+s.substring(end+1));
    }

    public static void main(String[] args) {
        Decode_String test=new Decode_String();
        String s="3[a2[c]]";
        System.out.println(test.decodeString(s));
    }
}
