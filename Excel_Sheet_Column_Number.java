

public class Excel_Sheet_Column_Number {
	public int titleToNumber(String s) {
		int length = s.length();
		int result = 0;
		for (int i = 0; i < length; i++) {
			result = result * 26 + (s.charAt(i) - 'A') + 1;
		}
		return result;

	}
}
