package com.LeetCode;


import java.util.*;

/**
 * Created by yuanjianwei on 2015/5/19.
 */
//tire tree backtracking
public class Word_Search_II {
    class trieNode {
        Map<Character, trieNode> map = new HashMap<>();
        boolean isWord = false;
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        int row = board.length;
        if (row == 0) {
            return result;
        }
        int column = board[0].length;
        boolean[][] mark = new boolean[row][column];
        if (words.length == 0) {
            return result;
        }
        trieNode root = new trieNode();
        for (String str : words) {
            trieNode node = root;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (node.map.containsKey(c)) {
                    node = node.map.get(c);
                } else {
                    trieNode temp = new trieNode();
                    node.map.put(c, temp);
                    node = temp;
                }
            }
            node.isWord = true;
        }
        Set<String> resultSet = new HashSet<>();
        Set<Character> key = root.map.keySet();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (key.contains(board[i][j])) {
                    StringBuffer bf = new StringBuffer();
                    bf.append(board[i][j]);
                    mark[i][j] = true;
                    searchWords(resultSet, root.map.get(board[i][j]), board, mark, i, j, bf);
                    mark[i][j] = false;
                }
            }
        }
        for (String str : resultSet) {
            result.add(str);
        }
        return result;
    }

    public void searchWords(Set<String> result, trieNode node, char[][] board, boolean[][] mark, int x, int y, StringBuffer temp) {
        if (node.isWord) {
            result.add(temp.toString());
        }
        if (node.map.keySet().isEmpty()) {
            return;
        }
        Set<Character> set = node.map.keySet();
        if (x > 0 && set.contains(board[x - 1][y]) && !mark[x - 1][y]) {
            char ch = board[x - 1][y];
            mark[x - 1][y] = true;
            StringBuffer bf = new StringBuffer(temp);
            bf.append(ch);
            searchWords(result, node.map.get(ch), board, mark, x - 1, y, bf);
            mark[x - 1][y] = false;
        }
        if (y > 0 && set.contains(board[x][y - 1]) && !mark[x][y - 1]) {
            char ch = board[x][y - 1];
            mark[x][y - 1] = true;
            StringBuffer bf = new StringBuffer(temp);
            bf.append(ch);
            searchWords(result, node.map.get(ch), board, mark, x, y - 1, bf);
            mark[x][y - 1] = false;
        }
        if (x < board.length - 1 && set.contains(board[x + 1][y]) && !mark[x + 1][y]) {
            char ch = board[x + 1][y];
            mark[x + 1][y] = true;
            StringBuffer bf = new StringBuffer(temp);
            bf.append(ch);
            searchWords(result, node.map.get(ch), board, mark, x + 1, y, bf);
            mark[x + 1][y] = false;
        }
        if (y < board[0].length - 1 && set.contains(board[x][y + 1]) && !mark[x][y + 1]) {
            char ch = board[x][y + 1];
            mark[x][y + 1] = true;
            StringBuffer bf = new StringBuffer(temp);
            bf.append(ch);
            searchWords(result, node.map.get(ch), board, mark, x, y + 1, bf);
            mark[x][y + 1] = false;
        }

    }

    public static void main(String[] args) {
        Word_Search_II test = new Word_Search_II();
//        char[][] board = {
//                {'o', 'a', 'a', 'n'},
//                {'e', 't', 'a', 'e'},
//                {'i', 'h', 'k', 'r'},
//                {'i', 'f', 'l', 'v'}};
        char[][] board = {
                {'a', 'a'}, {'c', 'd'}
        };
        String[] words = {"aaa", "dcabc"};
        System.out.println(test.findWords(board, words));
    }


}
