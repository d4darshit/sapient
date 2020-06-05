package com.sapient.calculator;

public class Operand<T extends Number> {

	double obj;

	public Operand() {
		super();
	}
	
	public Operand(double obj) {
		super();
		this.obj = obj;
	}

	public double getObj() {
		return obj;
	}

	public void setObj(double obj) {
		this.obj = obj;
	}
	
	
}
