package com.sapient;

public class Student {

		private int student_id;
		private String name;
		private String city;
		
		public int getStudent_id() {
			return student_id;
		}
		public void setStudent_id(int student_id) {
			this.student_id = student_id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Student [student_id=" + student_id + ", name=" + name + ", city=" + city + "]";
		}
	
}

