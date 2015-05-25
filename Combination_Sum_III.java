package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanjianwei on 2015/5/25.
 */
public class Combination_Sum_III {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        if (k <= 0 || n > 100) {
            return result;
        }
        combination(result, new ArrayList<>(), 1, k, n, 0);
        return result;
    }

    private void combination(List<List<Integer>> result, List<Integer> temp, int index, int k, int n, int sum) {
        if (k <= 0) {
            return;
        }
        for (int i = index; i <= 9; i++) {
            if (sum + i < n) {
                if (k > 0) {
                    List<Integer> list = new ArrayList<>(temp);
                    list.add(i);
                    combination(result, list, i + 1, k - 1, n, sum + i);
                }
            } else if (sum + i == n && k == 1) {
                temp.add(i);
                result.add(temp);
            }
        }
    }

    public static void main(String[] args) {
        Combination_Sum_III test = new Combination_Sum_III();
        System.out.println(test.combinationSum3(3, 9));
    }
}
