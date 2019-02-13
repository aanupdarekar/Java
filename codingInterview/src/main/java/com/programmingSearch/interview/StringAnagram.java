package com.programmingSearch.interview;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		makeAnagram("cde", "abc");
		int child = commonChild("SHINCHAN", "NOHARAAA");
		System.out.println(child);
	}
	
	  // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        int result =0;
        int character[] = new int[26];
        for(char c : a.toCharArray()){
            character[c - 'a']++;
        }
        for(char c : b.toCharArray()){
            character[c - 'a']--;
        }
        
        for(int i: character){
            result += Math.abs(i);
        }
        return result;
    }
    
 // Complete the commonChild function below.
    static int commonChild(String s1, String s2) {

        int result =0;
        int character[] = new int[26];
        for(char c: s1.toCharArray()){
            character[c - 'A']++;
        }
        
        for(char c: s2.toCharArray()){
            if(character[c - 'A'] > 0){
                result = result+1;
            }
            character[c - 'A']--;
        }
        return result;

    }

}
