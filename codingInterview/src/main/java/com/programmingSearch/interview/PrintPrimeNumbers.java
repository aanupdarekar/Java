package com.programmingSearch.interview;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  primeNumbers = "";

		for(int i=1;i<=100;i++){
			int counter =0;
			
			for(int num=i;num>=1;num--){
				if(num%i == 0){
					counter++;
				}
			}
			if (counter ==2)
			  {
			     //Appended the Prime number to the String
			     primeNumbers = primeNumbers + i + " ";
			  }	
		}
		

	}

}
