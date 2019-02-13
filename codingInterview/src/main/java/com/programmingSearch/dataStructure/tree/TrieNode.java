package com.programmingSearch.dataStructure.tree;

import java.util.HashMap;

public class TrieNode {

	private HashMap<Character,TrieNode> children;
	private boolean isWord;
	
	public TrieNode(){
		this.children = new HashMap<>();
	}
	public HashMap<Character, TrieNode> getChildren() {
		return children;
	}
	public void setChildren(HashMap<Character, TrieNode> children) {
		this.children = children;
	}

	public boolean isWord() {
		return isWord;
	}
	public void setWord(boolean isWord) {
		this.isWord = isWord;
	}
	
}
