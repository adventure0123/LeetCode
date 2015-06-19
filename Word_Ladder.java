package com.LeetCode;

import java.util.*;

/**
 * Created by yuanjianwei on 2015/6/19.
 */
public class Word_Ladder {
    public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        if (beginWord.equals(endWord)) {
            return 1;
        }
        Queue<String> current = new LinkedList<>();
        Queue<Integer> dist = new LinkedList<>();
        wordDict.add(endWord);
        current.add(beginWord);
        dist.add(1);
        int length = beginWord.length();
        while (!current.isEmpty()) {
            String s = current.poll();
            int p = dist.poll();
            if (s.equals(endWord)) {
                return p;
            }
            for (int i = 0; i < length; i++) {
                char[] str = s.toCharArray();
                for (char c = 'a'; c <= 'z'; c++) {
                    str[i] = c;
                    String word = new String(str);
                    if (wordDict.contains(word)) {
                        current.add(word);
                        dist.add(p + 1);
                        wordDict.remove(word);
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Word_Ladder test = new Word_Ladder();
        Set<String> wordDict = new HashSet<>();
        wordDict.add("a");
        wordDict.add("b");
        wordDict.add("c");
        System.out.println(test.ladderLength("a", "c", wordDict));
    }

}
