package com.programmingSearch.interview.string.dp;

public class StringInterleaving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="ab";
		String str2= "axy";
		String str3="axaby";
		StringInterleaving str = new StringInterleaving();
		System.out.println(str.isInterLeavingTest(str1, str2, str3));
		

	}
	
	public boolean isInterleaving(String str1, String str2, String str3){
		if(str3.length() != (str1.length() + str2.length())){
			return false;
		}
		
		//set the size of two dimensional array by incrementing size by 1
		boolean T[][] = new boolean[str1.length()+1][str2.length()+1];
		for(int i=0;i< T.length ;i++){
			for(int j=0;j< T[i].length;j++){
				
				int l=i+j-1;
				if(i == 0 && j == 0){
					T[i][j] = true;
				}else if(i == 0){
					if(str3.charAt(l) == str2.charAt(j-1)){
						T[i][j]= T[i][j-1];
					}
				}else if(j == 0){
					if(str3.charAt(l) == str1.charAt(i-1)){
						T[i][j]= T[i-1][j];
					}
				}else{
					T[i][j]= (str3.charAt(l) == str2.charAt(j-1)) ?T[i][j-1] : false || (str3.charAt(l) == str1.charAt(i-1))? T[i-1][j] : false;
				}
			}
		}
		return T[str1.length()][str2.length()];
	}

	
	
	public boolean isInterLeavingTest(String str1,String str2, String str3){
		
		boolean T[][] = new boolean[str1.length()+1][str2.length()+1];
		
		for(int row=0;row<T.length;row++){
			for(int col=0;col<T[row].length;col++){
				
				int l =row+col-1;
				if(row==0 && col==0){
					T[row][col] = true;
				}
				else if(row ==0){
					if(str3.charAt(l) == str2.charAt(col-1)){
						T[row][col] =T[row][col-1];
					}
					
				}
				else if(col ==0){
					if(str3.charAt(l) == str1.charAt(row-1)){
						T[row][col] =T[row -1][col];
					}
				}else{
					T[row][col]=(str3.charAt(l) == str2.charAt(col-1))?T[row][col-1] : false || str3.charAt(l) == str1.charAt(row-1)?	T[row -1][col]:false;			
				}
			}
			
		}
		
		return T[str1.length()][str2.length()];
		
	}
}
