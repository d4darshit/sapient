package com.sapient.question2;

public class Fig_to_Words {

	
	public static String fig_to_words(long number) {
	
		String []ones = {"","one","two","three","four","five","six","seven"
				,"eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen"
				,"sixteen","seventeen","eighteen","nineteen"};
		String []tens = {"",
			"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"	
		};
		long numberswithzero[] = {100,1000,100000,10000000};
		
		String result="";
		if(number==0)
				return result;
		
		 if ((number / 10000000) > 0) {
			   result += fig_to_words(number / 10000000) + " crore ";
			   number %= 10000000;
			}
		 if ((number / 100000) > 0) {
			    result += fig_to_words(number / 100000) + " lakh ";
			    number %= 100000;
			}
		 if ((number / 1000) > 0) {
			    result = result + fig_to_words(number / 1000) + " thousand ";
			    number %= 1000;
			}
		 if ((number / 100) > 0) {
			    result = result + fig_to_words(number / 100) + " hundred ";
			    number %= 100;
			}
		 if(number>0) {
			 if(number<20)
				 result= result + ones[(int) number];
			 else {
				 result = result + tens[(int) (number/10)];
			 if(number%10 >0)
				 result = result + ones[(int) (number%10)];
			 }
		 }
		 
		
		
		return result;
		
		
	}
	

}
