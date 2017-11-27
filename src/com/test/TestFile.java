package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("sample.txt");
			FileOutputStream fout = new FileOutputStream("sample1.txt");
			int n = 0;
			while ((n = fin.read()) > 0) {
				fout.write(n);
				//char ch = (char) n;
				//System.out.print(ch);
			}
			System.out.println("Copied Successfully");
			fin.close();
			fout.close();
		} catch (FileNotFoundException e) {
			System.out.println("FILE NOT FOUND");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("UNABLE TO READ");
			e.printStackTrace();
		}
	}
}
