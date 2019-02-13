package com.programmingSearch.dataStructure.tree;

public class Trie {

	private TrieNode root;
	
	public Trie(){
		root = new TrieNode();
	}
	
	public void insert(String word){
		/*TrieNode current = root;
		for(int i=0;i<word.length();i++){
			current = current.getChildren().computeIfAbsent(word.charAt(i), c-> new TrieNode());
		}
		current.setWord(true);*/
		
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			if (current.getChildren().get(word.charAt(i)) == null) {
				TrieNode node = new TrieNode();
				current.getChildren().put(word.charAt(i), node);
				current= current.getChildren().get(word.charAt(i));
			}else{
				current =current.getChildren().get(word.charAt(i));
			}

		}
		current.setWord(true);
	}
	
	public boolean find(String word) {
	    TrieNode current = root;
	    for (int i = 0; i < word.length(); i++) {
	        char ch = word.charAt(i);
	        TrieNode node = current.getChildren().get(ch);
	        if (node == null) {
	            return false;
	        }
	        current = node;
	    }
	    return current.isWord();
	}
	
	public static void main(String args[]){
		Trie trie = new Trie();
		 
	    trie.insert("Programming");
	    trie.insert("Pan");
	    trie.insert("is");
	    trie.insert("a");
	    trie.insert("way");
	    trie.insert("of");
	    trie.insert("life");
	 
	    System.out.println(trie.find("Programming"));
	    System.out.println(trie.find("Pan"));
	    System.out.println(trie.find("a"));
	    System.out.println(trie.find("way"));
	    System.out.println(trie.find("Prgramming"));
	}
}
