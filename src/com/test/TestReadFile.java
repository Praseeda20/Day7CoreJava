package com.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class TestReadFile {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("Employee.java");
//			BufferedReader br = new BufferedReader(fr);
			LineNumberReader br = new LineNumberReader(fr);
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(br.getLineNumber()+" "+str);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
