package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yuanjianwei on 2015/7/10.
 */
public class Combination_Sum_II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result=new ArrayList<>();
        if(candidates.length==0){
            return result;
        }
        combination( candidates,  target,0,result, new ArrayList<>(),0);
        return result;
    }

    private void  combination(int[] candidates, int target,int sum,List<List<Integer>> result,
                              List<Integer> temp,int index) {
//        if (index >= candidates.length||(index>=1&&candidates[index]==candidates[index-1])) {
//            return;
//        }
        int length = candidates.length;
        for (int i = index; i < length; i++) {
            if (sum + candidates[i] == target) {
                if (i == index ||( i  >= 1&& candidates[i] > candidates[i - 1])) {
                    List<Integer> list = new LinkedList<>(temp);
                    list.add(candidates[i]);
                    result.add(list);
                }
            } else if (sum + candidates[i] > target) {
                return;
            } else if(i==index||(i>=1&&candidates[i]>candidates[i-1])){
                List<Integer> list = new LinkedList<>(temp);
                list.add(candidates[i]);
                combination(candidates, target, sum + candidates[i], result, list, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Combination_Sum_II test=new Combination_Sum_II();
        int[] A={1,1};
        List<List<Integer>> result=test.combinationSum2(A,1);
        for(List temp:result){
            System.out.println(temp.toString());
        }
    }
}
