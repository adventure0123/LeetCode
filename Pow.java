

public class Pow {
	public double myPow(double x, int n) {
		if (n == 0) {
			return 1.0;
		}
		long time = Math.abs(new Long(n));
		double result = x;
		long count = 1;
		double temp = x;
		long alltimes = 1;
		while (alltimes < time) {
			count = count << 1;
			temp = temp * temp;
			if (alltimes + count >= time) {
				count = 1;
				temp = x;
			}
			result = result * temp;
			alltimes = alltimes + count;

		}
		return n > 0 ? result : 1 / result;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pow test = new Pow();
		System.out.println(test.myPow(1, -2147483648));
	}

}
