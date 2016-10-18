

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
		if (triangle.size() == 0) {
			return 0;
		}
		int size = triangle.size();
		int[] A = new int[size];
		for (int i = 0; i < size; i++) {
			List<Integer> temp = triangle.get(i);
			for (int j = i; j >= 0; j--) {
				if (j == 0) {
					A[j] = A[j] + temp.get(j);
				} else if (j == i) {
					A[j] = A[j - 1] + temp.get(j);
				} else {
					A[j] = A[j] < A[j - 1] ? A[j] + temp.get(j) : A[j - 1]
							+ temp.get(j);
				}
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < size; i++) {
			if (A[i] < min) {
				min = A[i];
			}
		}
		return min;

	}

	public static void main(String[] args) {
		Triangle test = new Triangle();
		List<List<Integer>> list = new ArrayList<>();
		list.add(new ArrayList<Integer>(Arrays.asList(2)));
		list.add(new ArrayList<Integer>(Arrays.asList(3, 4)));
		list.add(new ArrayList<Integer>(Arrays.asList(6, 5, 7)));
		list.add(new ArrayList<Integer>(Arrays.asList(4, 1, 8, 3)));
		System.err.println(test.minimumTotal(list));

	}
}
