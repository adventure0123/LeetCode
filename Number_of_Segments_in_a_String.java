/**
 * Created by adventure on 16/12/8.
 */
public class Number_of_Segments_in_a_String {
    public int countSegments(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int resultNum=0;
        int size=s.length();
        int start=-1;
        char ch;
        for (int i=0;i<size;i++){
            ch=s.charAt(i);
            if(ch!=' '){
                if(start==-1){
                    start=i;
                }
            }else{
              if(start!=-1){
                  resultNum++;
                  start=-1;
              }
            }
        }
        if(start!=-1){
            resultNum++;
        }
        return resultNum;
    }

    public static void main(String[] args) {
        Number_of_Segments_in_a_String test=new Number_of_Segments_in_a_String();
        String s="  love live! mu'sic forever ";
        System.out.println(test.countSegments(s));
    }
}
