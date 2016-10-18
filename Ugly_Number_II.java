

public class Ugly_Number_II {

	public int nthUglyNumber(int n) {
		int[] A=new int[n+1];
		int pos2=0;
		int pos3=0;
		int pos5=0;
		A[0]=1;
		for(int i=1;i<n;i++){
			A[i]=Math.min(A[pos2]*2, Math.min(A[pos3]*3, A[pos5]*5));
			if(A[i]==A[pos2]*2){
				pos2++;
			}
			if(A[i]==A[pos3]*3){
				pos3++;
			}
			if(A[i]==A[pos5]*5){
				pos5++;
			}
		}
		return A[n-1];
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ugly_Number_II test=new Ugly_Number_II();
		System.out.println(test.nthUglyNumber(10));
	}

}
