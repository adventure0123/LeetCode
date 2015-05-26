package com.LeetCode;
import java.util.*;

/**
 * Created by yuanjianwei on 2015/5/26.
 */
public class Merge_Intervals {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<>();
        if (intervals.size() == 1 || intervals.size() == 0) {
            return intervals;
        }
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start != o2.start) {
                    return o1.start - o2.start;
                } else {
                    return o1.end - o2.end;
                }
            }
        });
        int length = intervals.size();
        Interval temp = new Interval(intervals.get(0).start, intervals.get(0).end);
        for (int i = 1; i < length; i++) {
            Interval in = intervals.get(i);
            if (temp.end < in.start) {
                Interval iterval = new Interval(temp.start, temp.end);
                result.add(iterval);
                temp.start = in.start;
                temp.end = in.end;
            } else if (temp.end >= in.start && temp.end <= in.end) {
                temp.end = in.end;
            }
        }
        result.add(temp);
        return result;
    }

    public static void main(String[] args) {
        Merge_Intervals test=new Merge_Intervals();
        List<Interval> list=new ArrayList<>();
        list.add(new Interval(8,2));
        list.add(new Interval(1,8));
        list.add(new Interval(8,10));
        list.add(new Interval(15, 18));
        List<Interval> restul=test.merge(list);
        for(Interval temp:restul){
            System.out.println(temp.start+" "+temp.end);
        }

    }
}
