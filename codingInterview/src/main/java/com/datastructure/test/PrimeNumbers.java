package com.datastructure.test;

public class PrimeNumbers {

	public static void main(String[] args) {
		long a= System.currentTimeMillis();
		int i=0;
		int num =0;
		for(i=1;i<=100000;i++) {
			int	 counter =0;
			for(num=i;num>=1;num--) {
				if(i%num == 0) {
					counter =counter +1;
				}
			}
			
			if (counter==2) {
				//System.out.println(" Primer Number "+i);
			}
		}
		
		
		 long b= System.currentTimeMillis();
		    System.out.println(b-a);
	}

}
