package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuanjianwei on 2015/7/2.
 */
class TrieNode {
    // Initialize your data structure here.
    boolean isWord;
    Map<Character,TrieNode> map;
    public TrieNode() {
        isWord=false;
        map=new HashMap<>();
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode node=root;
        int length=word.length();
        if(length==0){
            node.isWord=true;
        }
        for(int i=0;i<length;i++){
            if(node.map.containsKey(word.charAt(i))){
                node=node.map.get(word.charAt(i));
            }else{
                TrieNode temp=new TrieNode();
                node.map.put(word.charAt(i),temp);
                node=temp;
            }
        }
        node.isWord=true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node=root;
        int length=word.length();
        if(length==0){
            return node.isWord;
        }
        for(int i=0;i<length;i++){
            if(node.map.containsKey(word.charAt(i))){
                node=node.map.get(word.charAt(i));
            }else{
                return false;
            }
        }
        return node.isWord;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        int length=prefix.length();
        TrieNode node=root;
        if(length==0){
            return !root.map.isEmpty();
        }
        for(int i=0;i<length;i++){
            if(node.map.containsKey(prefix.charAt(i))){
                node=node.map.get(prefix.charAt(i));
            }else{
                return  false;
            }
        }
        return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");