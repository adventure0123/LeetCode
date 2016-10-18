

import java.util.Arrays;

public class Perfect_Squares {
	 public int numSquares(int n) {
		 if(n==1){
			 return 1;
		 }
		 int [] A=new int[n+1];
		 A[1]=1;
		 for(int i=2;i*i<=n;i++){
			 A[i*i]=1;
		 }
		 //System.out.println(Arrays.toString(A));
		 for(int i=2;i<=n;i++){
			 if(A[i]==0){
				 int start=1;
				 int end=i-1;
				 A[i]=Integer.MAX_VALUE;
				 while(start<=end){
					 if(start+end==i){
						 A[i]=Math.min(A[i], A[start]+A[end]);
						 if(A[i]==2){
							 break;
						 }
						 start++;
						 end--;
					 }else if(start+end<i){
						 start++;
					 }else{
						 end--;
					 }
				 }
			 }
		 }
		 //System.out.println(Arrays.toString(A));
		return A[n];   
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perfect_Squares test=new Perfect_Squares();
		System.out.println(test.numSquares(13));
	}

}
