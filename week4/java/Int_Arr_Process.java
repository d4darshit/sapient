package week4.java;

import java.util.Arrays;
import java.util.Scanner;

public class Int_Arr_Process {

	private int size;
	int []array;
	
	public Int_Arr_Process(int []array) {
	this.array = array;	

	}
	void getSize() {
		Scanner sc = new Scanner(System.in);
		this.size = sc.nextInt();
		sc.close();
	}
	void defineSize() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Press 1 to set array size, press any other key to continue with the default size");
		int var =  sc.nextInt();
		if(var ==1)
		{
			getSize();
		}
		else {
			size = 10;
		}
		sc.close();
	}
	void creteArray() {
		array = new int [size];
	}
	
	void diplayHorizonally() {
		for(int element:array)
		{
			System.out.print(element+ " ");
		}
	
    }
	void displayVertically() {
		for(int element:array) {
			System.out.print(element+" ");
		}
			
	}	
	void sortArray() {
		Arrays.sort(array);
	}
	void smallestBiggest() {
		int max  = Integer.MIN_VALUE;
		int min  = Integer.MAX_VALUE;
		for(int e:array)
		{
			if(max<e)
				max = e;
		}
		for(int e:array) {
			if(min>e)
			{
				min = e;
			}
		}
		System.out.println("Max element is: "+max);
		System.out.println("Min element is: "+min);
	}
	int getSum() {
		int sum = 0;
		for(int e:array) {
			sum+=e;
		}
		return sum;
			
	}
	void readArray() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<size;i++) {
			array[i] =sc.nextInt(); 
		}
		sc.close();
			
	}
	
}
