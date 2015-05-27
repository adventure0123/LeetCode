package com.LeetCode;

import java.util.List;

/**
 * Created by yuanjianwei on 2015/5/27.
 */
public class Insert_Interval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if (newInterval == null) {
            return intervals;
        }
        int index = 0;
        int size = intervals.size();
        while (index < size && intervals.get(index).end < newInterval.start) {
            index++;
        }
        if (index < size) {
            newInterval.start = Math.min(intervals.get(index).start, newInterval.start);
        }
        while (index < intervals.size() && intervals.get(index).start <= newInterval.end) {
            newInterval.end = Math.max(newInterval.end, intervals.get(index).end);
            intervals.remove(index);
        }
        intervals.add(index, newInterval);
        return intervals;
    }


}
