package com.LeetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Addandsearch_Data_structure_design {
	private TrieNode root;
	public Addandsearch_Data_structure_design() {
		root = new TrieNode();
	}
	// Adds a word into the data structure
	public void addWord(String word) {
		TrieNode node = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (!node.map.containsKey(c)) {
				TrieNode temp = new TrieNode();
				node.map.put(c, temp);
			}
			node = node.map.get(c);
		}
		node.isWord = true;
	}

	// Returns if the word is in the data structure. A word could
	// contain the dot character '.' to represent any one letter.
	public boolean search(String word) {
		if (word.length() == 0) {
			return root.isWord;
		}
		TrieNode node = root;
		return is_find(word, 0, node);
	}

	private boolean is_find(String word, int index, TrieNode node) {
		char c = word.charAt(index);
		if (c == '.') {
			Iterator<Character> it = node.map.keySet().iterator();
			while (it.hasNext()) {
				if (index == word.length() - 1) {
					return node.map.get(it.next()).isWord;
				}
				if (is_find(word, index + 1, node.map.get(it.next()))) {
					return true;
				}
			}
			return false;
		} else {
			if (!node.map.containsKey(c)) {
				return false;
			} else {
				if (index == word.length() - 1) {
					return node.map.get(c).isWord;
				}
				return is_find(word, index + 1, node.map.get(c));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test case
		Addandsearch_Data_structure_design test = new Addandsearch_Data_structure_design();
		test.addWord("baa");
		test.addWord("dad");
		System.out.println(test.search("..sf"));
	}

	class TrieNode {
		// Initialize your data structure here.
		Map<Character, TrieNode> map = new HashMap<Character, TrieNode>();
		boolean isWord = false;
	}

}
