

public class Factorial_Trailing_Zeroes {
	public int trailingZeroes(int n) {
		if(n<5){
			return 0;
		}else{
			return trailingZeroes(n/5)+n/5;
		}
        
    }
}
