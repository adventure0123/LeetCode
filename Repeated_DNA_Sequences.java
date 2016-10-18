

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repeated_DNA_Sequences {
	public List<String> findRepeatedDnaSequences(String s) {
		List<String> result = new ArrayList<>();
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		int length = s.length();
		if (length < 10) {
			return result;
		}
		int m = 0;
		for (int i = 0; i < 10; i++) {
			m = m << 2;
			switch (s.charAt(i)) {
			case 'A':
				m = m | 0x0;
				break;
			case 'C':
				m = m | 0x1;
				break;
			case 'G':
				m = m | 0x2;
				break;
			case 'T':
				m = m | 0x3;
				break;
			}
		}
		map.put(m, true);
		for (int i = 1; i <= length - 10; i++) {
			m = m & 0x3ffff;
			m = m << 2;
			switch (s.charAt(i + 9)) {
			case 'A':
				m = m | 0x0;
				break;
			case 'C':
				m = m | 0x1;
				break;
			case 'G':
				m = m | 0x2;
				break;
			case 'T':
				m = m | 0x3;
				break;
			}
			if (map.containsKey(m)) {
				if (map.get(m)) {
					result.add(s.substring(i, i + 10));
					map.put(m, false);
				}
			} else {
				map.put(m, true);
			}
		}
		return result;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repeated_DNA_Sequences test = new Repeated_DNA_Sequences();
		String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		System.out.println(test.findRepeatedDnaSequences(s).toString());
	}

}
