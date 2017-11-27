package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestSerial1 {
	public static void main(String[] args) {
		//Employee obj=new Employee(1001,"John",78900);
		try {
			
			FileInputStream fin=new FileInputStream("emp.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			Employee emp=(Employee)oin.readObject();
			System.out.println(emp.getEmployeeId()+ " "+emp.getEmployeeName()+" "+emp.getEmployeeSalary());
			oin.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
