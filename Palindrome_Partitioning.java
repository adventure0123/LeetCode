package com.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yuanjianwei on 2015/6/19.
 */
public class Palindrome_Partitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new LinkedList<>();
        int length=s.length();
        if(length==0){
            return  result;
        }
        addPartition(result,new ArrayList<String>(),0,s);
        return result;
    }

    private void addPartition(List<List<String>> result,List<String> temp,int index,String s){
        if(index>=s.length()){
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(index,i,s)){
                List<String> list=new ArrayList<>(temp);
                list.add(s.substring(index, i + 1));
                if(i+1==s.length()){
                    result.add(list);
                    return;
                }else {
                    addPartition(result, list, i + 1, s);
                }
            }
        }
    }

    private boolean isPalindrome(int start,int end,String s){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return  false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome_Partitioning test=new Palindrome_Partitioning();
        String s="aab";
        List<List<String>> result=test.partition(s);
        for(List<String> temp:result){
            System.out.println(temp.toString());
        }
        System.out.println("completed");
    }
}
