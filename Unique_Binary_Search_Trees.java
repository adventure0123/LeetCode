

public class Unique_Binary_Search_Trees {
	public int numTrees(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int[] A = new int[n + 1];
		A[0] = 1;
		A[1] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				A[i] = A[i] + A[j - 1] * A[i - j];
			}
		}
		return A[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unique_Binary_Search_Trees test = new Unique_Binary_Search_Trees();
		System.out.println(test.numTrees(3));
	}
}
