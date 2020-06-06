package com.sapient.question2;

import java.util.ArrayList;
import java.util.List;

public class Command_Line1 {
	
	List<Integer> array = new ArrayList<Integer>();
	
	void setData(List<Integer> a) {
		array = a;
	}
	void calData() {
		int sum=0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int temp:array) {
			max = Math.max(max, temp);
			min = Math.min(min, temp);
			
			sum+=temp;
		}
		double avg=0;
		if(array.size()!=0) {
		
			avg = sum/array.size();
		}
		else {
			avg = 0;
		}
		
		System.out.println("Sum of the array is: "+sum);
		System.out.println("Average of the array is: "+avg);
		
		if(array.size()==0)
			System.out.println("There are no elements in the array");
		else
			System.out.println("Biggest element in array is: "+max);
		
		
		if(array.size()==0)
			System.out.println("There are no elements in the array");
		else
			System.out.println("Smallest element in array is: "+min);
	}
	
	void displayData() {
		for(int a:array) {
			System.out.print(a+" ");
		}
	}
	
	
	
	
}

