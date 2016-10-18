

public class Reverse_Words_in_a_String {
	public String reverseWords(String s) {

		if (s.length() == 0) {
			return "";
		}
		s = s.trim();
		String[] str = s.split(" ");
		StringBuffer bf = new StringBuffer();
		int size = str.length;
		for (int i = size - 1; i >= 0; i--) {
			if (!str[i].equals("")) {
				if (i == size - 1) {
					bf.append(str[i]);
				} else {
					bf.append(" ");
					bf.append(str[i]);
				}
			}
		}
		return bf.toString();

	}
}
