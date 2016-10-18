

public class Divide_Two_Integers {
	public int divide(int dividend, int divisor) {
		if(divisor==0){
			return Integer.MAX_VALUE;
		}
        long m=Math.abs(new Long(dividend));
        long n=Math.abs(new Long(divisor));
        long result=0;
        long temp=n;
        long time=1;
        long div=n;
        while(temp<=m){
        	div=div<<1;
        	if(div+temp<=m){
        		time=time<<1;
        	}else{
        		div=n;
        		time=1;
        	}
        	temp+=div;
        	result+=time;
        }
        if((dividend>0&&divisor<0)||(dividend<0&&divisor>0)){
        	return -result<Integer.MIN_VALUE?Integer.MAX_VALUE:(int)result*-1;
        }else{
        	return result>Integer.MAX_VALUE?Integer.MAX_VALUE:(int)result;
        }
		
    }
	
	public static void main(String[] args) {
		Divide_Two_Integers test=new Divide_Two_Integers();
		System.out.println(test.divide(Integer.MIN_VALUE, -1));
	}
}
