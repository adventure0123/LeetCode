

public class String_to_Integer {
	public int atoi(String str) {
		str = str.trim();
		int length = str.length();
		if (length == 0) {
			return 0;
		}
		long result = 0;
		boolean positive = true;
		for (int i = 0; i < length; i++) {
			if (i == 0 && str.charAt(i) == '-') {
				positive = false;
				continue;
			}
			if (i == 0 && str.charAt(i) == '+') {
				continue;
			}
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				break;
			}
			result = result * 10 + str.charAt(i) - '0';
			if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
				break;
			}
		}
		result = positive ? result : result * -1;
		if (result > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if (result < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		return (int) result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_to_Integer testInteger = new String_to_Integer();
		System.err.println(testInteger.atoi("9223372036854775809"));
	}

}
