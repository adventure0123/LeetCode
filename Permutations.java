package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yuanjianwei on 2015/5/21.
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        if (length == 0) {
            return result;
        }
        addPermute(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void addPermute(List<List<Integer>> result, List<Integer> temp, int[] nums, int index) {
        if (index == nums.length - 1) {
            temp.add(nums[index]);
            result.add(temp);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            List<Integer> list = new ArrayList<>(temp);
            list.add(nums[index]);
            addPermute(result, list, nums, index + 1);
            swap(nums, index, i);
        }

    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        Permutations test = new Permutations();
        int[] nums = {1, 2, 3};
        System.out.println(test.permute(nums).toString());
    }
}
