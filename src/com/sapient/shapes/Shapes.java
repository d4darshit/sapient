package com.sapient.shapes;

import java.util.Scanner;

public class Shapes {

	private int numberOfSides;
	
	public static void calculateShapeArea(int numberOfSides,int length) {
	
		if(numberOfSides==1) {
			Circle c  = new Circle();
			System.out.println("The Area of the Circle is "+c.calculateArea(length));
			c=null;
		}
		else if(numberOfSides==3) {
			Triangle t  = new Triangle();
			System.out.println("The Area of the Triangle is "+t.calculateArea(length));
			t=null;
			
		}
		else if(numberOfSides==4){
			Square s = new Square();
			System.out.println("The Area of the Square is"+s.calculateArea(length));
			s=null;
		}		
		else {
			System.out.println("No Shapes Present");
		}
			
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of sides and length: ");
		int numberOfSides = sc.nextInt();
		int length= sc.nextInt();
		sc.close();
		calculateShapeArea(numberOfSides,length);
		
	
	}
}
