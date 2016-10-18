

import java.util.LinkedList;
import java.util.List;

public class Generate_Parentheses {
	public List<String> generateParenthesis(int n) {
		List<String> result = new LinkedList<>();
		if (n == 0) {
			return result;
		}
		Parentheses(result, 0, 0, n, new StringBuffer());
		return result;

	}

	private void Parentheses(List<String> result, int left, int right, int n,
			StringBuffer temp) {
		if (left == right && left == n) {
			result.add(temp.toString());
			return;
		}

		if (left < n) {
			Parentheses(result, left + 1, right, n,
					new StringBuffer(temp).append('('));
		}
		if (left > right) {
			Parentheses(result, left, right + 1, n,
					new StringBuffer(temp).append(')'));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generate_Parentheses test = new Generate_Parentheses();
		System.out.println(test.generateParenthesis(3).toString());
	}

}
