package com.LeetCode;

/**
 * Created by yuanjianwei on 2015/6/24.
 */
public class Gas_Station {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int length = cost.length;
        int[] A = new int[length];
        int result = 0;
        for (int i = 0; i < length; i++) {
            A[i] = gas[i] - cost[i];
            result += A[i];
        }
        if (result < 0) {
            return -1;
        }
        int index = 0;
        int temp = 0;
        boolean start = true;
        for (int i = 0; i < length; i++) {
            if (start && A[i] >= 0) {
                index = i;
                temp = A[i];
                start = false;
                continue;
            }
            if (!start) {
                temp = temp + A[i];
                if (temp < 0) {
                    start = true;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Gas_Station test = new Gas_Station();
        int[] g = {1, 2, 3, 3};
        int[] c = {2, 1, 5, 1};
        System.out.println(test.canCompleteCircuit(g, c));
    }
}
