package org.cts.delta.login;

public class CourseDetails {
	
	public void javaCourse() {
		System.out.println("Java");

	}
	
	private void oracleCourse() {
		System.out.println("Oracle");

	}
	
	public void seleniumCourse() {
		System.out.println("Selenium");

	}
	
	
	public static void main(String[] args) {
		
		//Creation of object ===== ClassName obj/RefName = new ClassName();
		
		CourseDetails cou = new CourseDetails();
		
		//Call the methods ======= obj/RefName.MethodName();
		
		cou.javaCourse();
		cou.seleniumCourse();
		cou.oracleCourse();
	}

}

