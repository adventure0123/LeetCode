

public class Compare_Version_Numbers {
	public int compareVersion(String version1, String version2) {
		String[] s1 = version1.split("\\.");
		String[] s2 = version2.split("\\.");
		int length1 = s1.length;
		int length2 = s2.length;
		int a, b, i;
		for (i = 0; i < length1 && i < length2; i++) {
			a = Integer.parseInt(s1[i]);
			b = Integer.parseInt(s2[i]);
			if (a < b) {
				return -1;
			} else if (a > b) {
				return 1;
			}
		}
		if (i < length1) {
			for (int j = i; j < length1; j++) {
				if (Integer.parseInt(s1[i]) != 0) {
					return 1;
				}
			}
		}
		if (i < length2) {
			for (int j = i; j < length2; j++) {
				if (Integer.parseInt(s2[i]) != 0) {
					return -1;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Compare_Version_Numbers test = new Compare_Version_Numbers();
		String s1 = "1.1.00000";
		String s2 = "1.1";
		System.out.println(test.compareVersion(s1, s2));
	}
}
