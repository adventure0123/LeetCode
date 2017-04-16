/**
 * Created by adventure on 2017/4/16.
 */
public class Student_Attendance_Record_I {
    public boolean checkRecord(String s) {
        int ATimes=0;
        int TTimes=0;
        int length=s.length();
        if(length==0){
            return false;
        }
        for(int i=0;i<length;i++){
            if(s.charAt(i)=='A'){
                ATimes++;
                if(ATimes>1){
                    return false;
                }
            }
            if(i>0&&s.charAt(i)=='L'&&s.charAt(i-1)=='L'){
                TTimes=TTimes==0?2:3;
                if(TTimes>2){
                    return false;
                }
            }else {
                TTimes=0;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        Student_Attendance_Record_I test=new Student_Attendance_Record_I();
        String s="LALL";
        System.out.println(test.checkRecord(s));
    }
}
