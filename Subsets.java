package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yuanjianwei on 2015/6/1.
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        result.add(temp);
        int length = nums.length;
        if (length == 0) {
            return result;
        }
        Arrays.sort(nums);
        addSubsets(result, temp, 0, length, nums);
        return result;
    }

    private void addSubsets(List<List<Integer>> result, List<Integer> temp, int index, int length, int[] nums) {
        for (int i = index; i < length; i++) {
            List<Integer> list = new ArrayList<>(temp);
            list.add(nums[i]);
            result.add(list);
            addSubsets(result, list, i + 1, length, nums);
        }
    }

    public static void main(String[] args) {
        Subsets test = new Subsets();
        int[] nums = {2, 1, 3};
        List<List<Integer>> result = test.subsets(nums);
        for (List<Integer> temp : result) {
            System.out.println(temp.toString());
        }
    }
}
