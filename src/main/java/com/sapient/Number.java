package com.sapient;

public class Number {

	public int checkPrime(int number) {

		for(int i=2;i<=i/2;i++) {
			if(number%i==0)	
				return 0;	
		}
		
		return 1;
	}

}
