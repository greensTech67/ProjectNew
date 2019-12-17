package org.cts.delta.login;

public class ClientDetails extends CourseDetails{
	
	protected void cliName() {
		System.out.println("Delta");

	}
	
	public void cliId() {
		System.out.println(6789);

	}
	
	private void cliLocation() {
		System.out.println("USA");

	}
	
	public static void main(String[] args) {
		
		ClientDetails cl = new ClientDetails();
		
		cl.cliName();
		cl.cliId();
		cl.cliLocation();
		
		CourseDetails co = new CourseDetails();
		
		co.javaCourse();
		co.seleniumCourse();
		
		
	}

}
