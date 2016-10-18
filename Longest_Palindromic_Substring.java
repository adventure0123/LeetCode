

//Manacher using symmetric 
public class Longest_Palindromic_Substring {
	
	public String longestPalindrome(String s) {
        if(s.length()==0){
			return "";
		}
		String T=processS(s);
		int length=T.length();
		int[] p=new int[length];
		int C=0;
		int R=0;
		for(int i=1;i<length-1;i++){
			int i_mirror=2*C-i;
			p[i]=R>i?Math.min(p[i_mirror], R-i):0;
			while(T.charAt(i-p[i]-1)==T.charAt(i+p[i]+1)){
				p[i]++;
			}
			if(p[i]+i>R){
				R=p[i]+i;
				C=i;
			}
		}
		int maxLenght=0;
		int start=0;
		for(int i=1;i<length-1;i++){
			if(p[i]>maxLenght){
				maxLenght=p[i];
				start=(i-maxLenght-1)/2;
			}
		}
		return s.substring(start, start+maxLenght);
        
    }
	
	private  String processS(String s){
		//^ and $ in order to manage the edge
		StringBuffer buffer=new StringBuffer("^#");
		for(int i=0;i<s.length();i++){
			buffer.append(s.charAt(i));
			buffer.append("#");
		}
		buffer.append("$");
		return buffer.toString(); 
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Longest_Palindromic_Substring test=new Longest_Palindromic_Substring();
		System.out.println(test.longestPalindrome("abcbc"));
	}

}
