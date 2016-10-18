

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {

	public List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<String>();
		if (digits.length() == 0) {
			return result;
		}
		String[] mapBuffers = { "", "", "abc", "def", "ghi", "jkl", "mno",
				"pqrs", "tuv", "wxyz" };
		processLetter(result, 0, digits, new StringBuffer(), mapBuffers);
		return result;
	}

	public void processLetter(List<String> result, int index, String digits,
			StringBuffer temp, String[] mapBuffers) {
		if (index == digits.length() - 1) {
			String s = mapBuffers[digits.charAt(index) - '0'];
			for (int i = 0; i < s.length(); i++) {
				StringBuffer buffer = new StringBuffer(temp);
				buffer.append(s.charAt(i));
				result.add(buffer.toString());
			}
			return;
		} else {
			String s = mapBuffers[digits.charAt(index) - '0'];
			if (s.length() == 0) {
				processLetter(result, index + 1, digits, temp, mapBuffers);
				return;
			}
			for (int i = 0; i < s.length(); i++) {
				StringBuffer buffer = new StringBuffer(temp);
				buffer.append(s.charAt(i));
				processLetter(result, index + 1, digits, buffer, mapBuffers);
			}
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter_Combinations_of_a_Phone_Number test = new Letter_Combinations_of_a_Phone_Number();
		List<String> resultList = test.letterCombinations("03");
		for (String s : resultList) {
			System.out.println(s);
		}
	}

}
