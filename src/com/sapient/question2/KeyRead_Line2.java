package com.sapient.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KeyRead_Line2 {
	List<Integer> list = new ArrayList<Integer>();
	Scanner sc;
	
	void Read(int n) {
		sc = new Scanner(System.in);
		for(int i=-0;i<n;i++) {
			int t = sc.nextInt();
			list.add(t);
		}
		sc.close();		
	}

	void display() {
		System.out.println("Entered elements are: ");
		for(int a:list) {
			System.out.print(a+" ");
		}
		
	}
	void sort() {
		Collections.sort(list);
		System.out.println("Sorted elements are: ");
		for(int a:list) {
			System.out.print(a+" ");
		}
		
	}
	boolean search(int key) {
		for(int a:list) {
			if(a==key)
				return true;
		}
		return false;
	}
	

}
