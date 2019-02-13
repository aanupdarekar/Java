package com.programmingSearch.interview;

public class Prime {

    public static void main(String[] args) {

        int num = 29;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
        
        if("God".equals("god")){
        	System.out.println("Hello");
        }
        
        detectPrime(17);
    }
    
    public  static void detectPrime(int number){
    	long a= System.currentTimeMillis();
    for(number=2;number <100000;number++){	
    	boolean flag =false;
    	for(int i=2;i <= Math.sqrt(number);i++){
    		if(number %i == 0){
    			flag=true;
    			break;
    		}
    	}
    //	 if (!flag)
            // System.out.println(number + " is a prime number.");
        
    	
    }
    	
    long b= System.currentTimeMillis();
    System.out.println(b-a);
    }
}