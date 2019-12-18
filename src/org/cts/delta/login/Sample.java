package org.cts.delta.login;

public class Sample {

	// OverLoading >> Same Class/Same Method/diff Arguments

	// Diff Arguments >> Diff Datatypes

	public void emp(String empName) {
		System.out.println(empName);

	}

	public void emp(int empId) {
		System.out.println(empId);
	}

	// Diff Arguments >> Order OF DataType

	public void emp(int empId, long phNo) {
		System.out.println(empId);
		System.out.println(phNo);
	}

	public void emp(long phNo, int empId) {
		System.out.println(phNo);
		System.out.println(empId);
	}

	// Diff Arguments >> Count of DataType
	private void emp(int empId, int empID2) {
		System.out.println(empId + " " + empID2);
	}

	private void emp(int empId, int empID2, int empId3) {
		System.out.println(empId + " " + empID2 + " " + empId3);
	}

	public static void main(String[] args) {
		Sample obj = new Sample();

		obj.emp(4567);
		obj.emp("raseem");
		obj.emp(4567, 5678);
		obj.emp(45678, 5678);

	}
}
