

public class Rectangle_Area {
	 public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		 int x=Math.max(A, E);
		 int y=Math.min(C, G);
		 int z=Math.max(B, F);
		 int w=Math.min(D, H);
		 int total=(C-A)*(D-B)+(G-E)*(H-F);
		 if(x>=y||z>=w){
			 return total;
		 }else{
			 return total-(y-x)*(w-z);
		 }
		 
	        
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
