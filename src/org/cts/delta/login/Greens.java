package org.cts.delta.login;

public class Greens extends Sample {
//OverRiding // DiffClass, Same Method, Same Argument
	@Override
	public void emp(int empId) {
		System.out.println(empId);
	}

	@Override
	public void emp(String empName) {
		System.out.println(empName);
	}

	@Override
	public void emp(int empId, long phNo) {
		System.out.println(empId);
		System.out.println(phNo);
	}

	public static void main(String[] args) {
		Greens obj = new Greens();
		obj.emp(5678);
		obj.emp("rasd");
		obj.emp(456, 4567l);
		

	}
}
