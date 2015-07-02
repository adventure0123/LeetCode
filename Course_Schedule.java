package com.LeetCode;

import java.util.*;

/**
 * Created by yuanjianwei on 2015/7/1.
 */
public class Course_Schedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,Set<Integer>> out=new HashMap<>();
        Map<Integer,Set<Integer>> in=new HashMap<>();
        int length=prerequisites.length;
        if(length==0){
            return true;
        }
        int first,second;
        for(int i=0;i<length;i++){
            first=prerequisites[i][0];
            second=prerequisites[i][1];
            if(out.containsKey(second)){
                out.get(second).add(first);
            }else{
                Set<Integer> set=new HashSet<>();
                set.add(first);
                out.put(second,set);
            }

            if(in.containsKey(first)){
                in.get(first).add(second);
            }else{
                Set<Integer> set=new HashSet<>();
                set.add(second);
                in.put(first,set);
            }
        }

        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(!in.containsKey(i)){
                queue.add(i);
            }
        }
        int count=0;
        int temp;
        while(!queue.isEmpty()){
            temp=queue.poll();
            count++;
            Set<Integer> set=out.get(temp);
            if(set!=null) {
                for (int num : set) {
                   // System.out.println(in.get(num).size());
                    in.get(num).remove(temp);
                    //System.out.println(in.get(num).size());
                    if (in.get(num).isEmpty()) {
                        queue.add(num);
                    }
                }
            }
        }
        //System.out.println(count);
        return count==numCourses?true:false;
    }

    public static void main(String[] args) {
        Course_Schedule test=new Course_Schedule();
        int[][] A={{2,0},{2,1}};
        System.out.println(test.canFinish(3,A));
    }
}
