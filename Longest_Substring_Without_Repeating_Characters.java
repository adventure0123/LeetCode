

import java.util.HashMap;
import java.util.Map;

//hashmap O(n)
public class Longest_Substring_Without_Repeating_Characters {

	public int lengthOfLongestSubstring(String s) {
		if (s.length() == 0) {
			return 0;
		}
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int start = 0;
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, i);
				if (i - start + 1 > result) {
					result = i - start + 1;
				}
			} else {
				int index = map.get(c);
				for (int j = start; j < index; j++) {
					map.remove(s.charAt(j));
				}
				map.put(c, i);
				start = index + 1;
			}
		}
		return result;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Longest_Substring_Without_Repeating_Characters test = new Longest_Substring_Without_Repeating_Characters();
		System.out.println(test.lengthOfLongestSubstring("bbtablud"));
	}

}
