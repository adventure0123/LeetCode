

public class Maximum_Product_of_Word_Lengths {
	 public int maxProduct(String[] words) {
		 int length=words.length;
		 if(length==0){
			 return 0;
		 }
		 int[] val=new int[length];
		 for(int i=0;i<length;i++){
			 char[] ch=words[i].toCharArray();
			 int temp=0;
			 for(char c:ch){
			
				 temp=temp|1<<(c-'a');
			 }
		
			 val[i]=temp;
		 }
		 int res=0;
		 for(int i=0;i<length;i++){
			 for(int j=i+1;j<length;j++){
				 if((val[i]&val[j])==0&&words[i].length()*words[j].length()>res){
					
					 res=words[i].length()*words[j].length();
				 }
			 }
		 }
		return res;
	        
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maximum_Product_of_Word_Lengths test=new Maximum_Product_of_Word_Lengths();
		String[] strings={"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
		System.out.println(test.maxProduct(strings));
	}

}
