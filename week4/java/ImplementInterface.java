package week4.java;

import java.util.Scanner;

public class ImplementInterface  {
	
	public static void main(String []args) {
		Num_Process operation[] = new Num_Process[4];
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Enter any give option:");
		System.out.println("1. Addition");
		System.out.println("2.Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		int choice = sc.nextInt();
		sc.close();
			operation[0] = (a,b)->{
			return a+b;
				};
				
		operation[1] = (a,b)->{
			return a-b;
				};	
		operation[2] = (a,b)->{
			return a*b;
				};		
		operation[3] = (a,b)->{
			return a/b;
				};
		
		System.out.println(operation[choice-1].cal(x, y));
		
	}

}
