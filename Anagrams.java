package com.LeetCode;

import java.util.*;

/**
 * Created by yuanjianwei on 2015/5/22.
 */

//hashmap
public class Anagrams {
    public List<String> anagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        int length = strs.length;
        if (length == 0) {
            return result;
        }
        for (int i = 0; i < length; i++) {
            char[] chs = strs[i].toCharArray();
            Arrays.sort(chs);
            String s = String.valueOf(chs);
            if (chs.length == 0) {
                s = "";
            }
            if (map.containsKey(s)) {
                map.get(s).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(s, list);
            }
        }
        for (List<String> list : map.values()) {
            if (list.size() > 1) {
                result.addAll(list);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Anagrams test = new Anagrams();
        String[] strs = {"", ""};
        System.out.println(test.anagrams(strs));

    }
}
