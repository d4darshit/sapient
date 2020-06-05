package com.sapient;

public class Number {

	public Boolean checkPrime(int number) {

		for(int i=2;i<=number/2;i++) {
			if(number%i == 0)	
				return false;	
		}
		
		return true;
	}

	public boolean checkArmstrong(int number) {
		
		int remainder =0;
		int sum=0;
		int temp = number;
		while (temp != 0)
        {
            remainder = temp % 10;
            sum += Math.pow(remainder, 3);
            temp /= 10;
        }
		if(sum==number)
			return true;
		
		return false;
	}
	
	

}
