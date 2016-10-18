

import java.util.HashMap;
import java.util.Map;

public class Remove_Duplicate_Letters {
	 public String removeDuplicateLetters(String s) {
		 int length=s.length();
		 if(length==0){
			 return "";
		 }
		 int ch[]=new int[26];
		 for(int i=0;i<length;i++){
			 ch[s.charAt(i)-'a']++;
		 }
		 int index=0;
		 for(int i=0;i<length;i++){
			 if(s.charAt(i)<s.charAt(index)){
				 index=i;
			 }
			 if(--ch[s.charAt(i)-'a']==0){
				 break;
			 }
		 }
		 return s.charAt(index)+removeDuplicateLetters(s.substring(index+1).replaceAll(""+s.charAt(index), ""));
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove_Duplicate_Letters test=new Remove_Duplicate_Letters();
		String string="cbacdcbc";
		System.out.println(test.removeDuplicateLetters(string));
	}

}
