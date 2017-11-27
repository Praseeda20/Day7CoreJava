package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestFile2 {
	public static void main(String[] args) {
		String empName = "John";
		int empId = 1001;
		double empSalary = 9000;
		try {
			PrintWriter out = new PrintWriter(new File("emp.txt"));
			out.println(empName);
			out.println(empId);
			out.println(empSalary);
			out.close();
			System.out.println("DATA STORED IN EMP.TXT");
		} catch (FileNotFoundException e) {
		 System.out.println("FILE NOT FOUND");
			e.printStackTrace();
		}

	}
}
