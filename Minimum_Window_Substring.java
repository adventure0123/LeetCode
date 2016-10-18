

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Minimum_Window_Substring {
	public String minWindow(String s, String t) {
		int length_s = s.length();
		int length_t = t.length();
		if (length_t == 0 || length_s == 0 || length_t > length_s) {
			return "";
		}
		Map<Character, Integer> shouldFind = new HashMap<>();
		Map<Character, Integer> hasFind = new HashMap<>();
		Set<Character> countSet = new HashSet<Character>();
		char c;
		for (int i = 0; i < length_t; i++) {
			c = t.charAt(i);
			if (shouldFind.containsKey(c)) {
				shouldFind.put(c, shouldFind.get(c) + 1);
			} else {
				shouldFind.put(c, 1);
			}
		}
		int start = 0;
		// int end=0;
		int result = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < length_s; i++) {
			c = s.charAt(i);
			if (shouldFind.containsKey(c)) {
				if (hasFind.containsKey(c)) {
					hasFind.put(c, hasFind.get(c) + 1);
				} else {
					hasFind.put(c, 1);
				}
			} else {
				continue;
			}

			if (hasFind.get(c) >= shouldFind.get(c) && !countSet.contains(c)) {
				countSet.add(c);
			}
			if (countSet.size() >= shouldFind.size()) {
				for (; start < i; start++) {
					c = s.charAt(start);
					if (hasFind.containsKey(c)) {
						if (hasFind.get(c) - 1 < shouldFind.get(c)) {
							break;
						} else {
							hasFind.put(c, hasFind.get(c) - 1);
						}
					}
				}
				if (i - start + 1 < result) {
					result = i - start + 1;
					index = start;
				}

			}

		}
		// System.out.println(index+"  "+result);
		if (countSet.size() >= shouldFind.size()) {
			return s.substring(index, index + result);
		} else {
			return "";
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Minimum_Window_Substring test = new Minimum_Window_Substring();
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(test.minWindow(s, t));
	}

}
