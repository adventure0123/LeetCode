

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_II {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> result = new ArrayList<>();
		result.add(1);
		for (int i = 0; i <= rowIndex; i++) {
			for (int j = i; j >= 1; j--) {
				if (j == i) {
					result.add(1);
				} else {
					result.set(j, result.get(j) + result.get(j - 1));
				}
			}
		}
		return result;

	}

	public static void main(String[] args) {
		Pascals_Triangle_II test = new Pascals_Triangle_II();
		System.out.println(test.getRow(4));
	}
}
