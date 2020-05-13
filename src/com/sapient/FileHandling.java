package com.sapient;

import java.io.File;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		File directory =  new File(input);
		String[] children = directory.list();
		if(children==null) {
			System.out.println("invalid input");
			
		}
		else {
			for (int i = 0; i < children.length; i++) {
				System.out.println(children[i]);
			}
		}
		
	}
}
