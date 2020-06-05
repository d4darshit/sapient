package com.sapient.calculator;

public class Runner {

	public static void main(String[] args) {
		Operand o1 = new Operand(10);
		Operand o2 = new Operand(15);
		ArithmeticOperation operation = new Addition();
		System.out.println((operation.getArithmeticOperation(o1, o2)).obj);
		
	}
	
}
