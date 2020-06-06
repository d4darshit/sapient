package com.sapient.question2;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=2;i<args.length;i++) {
			int temp = Integer.parseInt(args[i]);
			list.add(temp);
		}
		Command_Line1 ob = new Command_Line1();
		ob.setData(list);
		ob.calData();
		ob.displayData();
		

		System.out.println("Number is: "+Fig_to_Words.fig_to_words(153400l));
	}
}
