

import java.util.Arrays;

public class Best_Time_to_Buy_and_Sell_Stock {
	public int maxProfit(int[] prices) {
		int length = prices.length;
		if (length == 0) {
			return 0;
		}
		for (int i = length - 1; i >= 1; i--) {
			prices[i] = prices[i] - prices[i - 1];
		}
		// System.out.println(Arrays.toString(prices));
		int result = 0;
		int temp = 0;
		for (int i = 1; i < length; i++) {
			if (prices[i] + temp > prices[i]) {
				temp = prices[i] + temp;
			} else {
				temp = prices[i];
			}
			result = temp > result ? temp : result;
		}
		return result;

	}

	public static void main(String[] args) {
		Best_Time_to_Buy_and_Sell_Stock test = new Best_Time_to_Buy_and_Sell_Stock();
		int[] A = { 2, 1, 2, 0, 1 };
		System.out.println(test.maxProfit(A));
	}
}
