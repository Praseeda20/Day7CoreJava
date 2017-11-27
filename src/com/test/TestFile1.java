package com.test;

import java.io.File;

public class TestFile1 {
	public static void main(String[] args) {
		String str="c://Windows";
		File file=new File(str);
		if(file.exists() && file.isDirectory())
		{
			String [] listOfFiles=file.list();
			for(String filename: listOfFiles)
			{
				System.out.println(filename);
			}
			System.out.println("Length= "+file.length());
		}
		else
		{
			System.out.println("FILE NOT FOUND OR NOT A FILE");
		}
	}
}
