package com.sapient.calculator;

public class Division extends ArithmeticOperation {

	@Override
	public Operand getArithmeticOperation(Operand o1, Operand o2) {
		return new Operand(o1.getObj()/o2.obj);
	
	}

}
