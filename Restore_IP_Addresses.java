

import java.util.ArrayList;
import java.util.List;

public class Restore_IP_Addresses {
	public List<String> restoreIpAddresses(String s) {
		List<String> result = new ArrayList<>();
		StringBuffer temp = new StringBuffer(s);
		addIP(result, temp, s.length(), 0, 0, s);
		return result;

	}

	private void addIP(List<String> result, StringBuffer temp, int length,
			int index, int times, String s) {
		String sub;
		int num;
		for (int i = index + 1; i < length; i++) {
			sub = s.substring(index, i);
			num = Integer.parseInt(sub);
			if (num >= 0 && num <= 255 && sub.charAt(0) != '0'
					|| sub.length() == 1) {
				StringBuffer bf = new StringBuffer(temp);
				bf.insert(i + times, '.');
				if (times == 2 && length - i <= 4) {
					sub = s.substring(i, length);
					num = Integer.parseInt(sub);
					if (num >= 0 && num <= 255 && sub.charAt(0) != '0'
							|| sub.length() == 1) {
						result.add(bf.toString());
					}
				} else if (times < 2) {
					addIP(result, bf, length, i, times + 1, s);
				}
			} else {
				return;
			}
		}

	}

	public static void main(String[] args) {
		Restore_IP_Addresses test = new Restore_IP_Addresses();
		String s = "0000";
		List<String> result = test.restoreIpAddresses(s);
		for (String str : result) {
			System.out.println(str);
		}
	}
}
