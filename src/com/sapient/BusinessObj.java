package com.sapient;


import java.util.ArrayList;
import java.util.Collections;

public class BusinessObj {


	ArrayList<Student> students=new ArrayList<>() ;
	
	void readStudent(int student_id, String name, String city) {
		Student obj = new Student();
		obj.setCity(city);
		obj.setStudent_id(student_id);
		obj.setName(name);
		students.add(obj);
	}
	void disStudent(Student obj) {
		
		for (int i = 0; i < students.size(); i++) {
		
			System.out.println(obj.toString());
		}
	}
	void disCityAll(String city) {
		for (int i = 0; i < students.size(); i++) {
			if(students.get(i).getCity()==city) {
				System.out.println(students.get(i));
			}
		}
		
	}
	void disNameWise() {
		Collections.sort(students,(p,q)->{return p.getName().compareTo(q.getName());});
	}
	void disCityWise() {
		Collections.sort(students,(p,q)->{return p.getCity().compareTo(q.getCity());});
	}
	void displayStudentId(int id) {
		try {
			for(Student s:students) {
				if(s.getStudent_id()==id)
				{
					System.out.println(s);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Student not found");
		}
	}
	
	
}
