package com.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yuanjianwei on 2015/7/10.
 */
public class Combination_Sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result=new ArrayList<>();
        if(candidates.length==0){
            return result;
        }
        combination( candidates,  target,0,result, new ArrayList<>(),0);
        return result;
    }

    private void  combination(int[] candidates, int target,int sum,List<List<Integer>> result,
                              List<Integer> temp,int index){
        if(index>=candidates.length){
            return;
        }
        int length=candidates.length;
        for(int i=index;i<length;i++){
            if(sum+candidates[i]==target){
                List<Integer> list=new LinkedList<>(temp);
                list.add(candidates[i]);
                result.add(list);
            }else if(sum+candidates[i]>target){
                return;
            }else{
                List<Integer> list=new LinkedList<>(temp);
                list.add(candidates[i]);
                combination(candidates, target,sum+candidates[i],result, list,i);
            }
        }
    }

    public static void main(String[] args) {
        int[] A={2,3,6,7};
        Combination_Sum test=new Combination_Sum();
        List<List<Integer>> result=test.combinationSum(A, 7);
        for (List temp:result){
            System.out.println(temp.toString());
        }
    }
}
