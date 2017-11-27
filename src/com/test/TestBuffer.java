package com.test;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBuffer {
	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("testbuf.txt");
			BufferedOutputStream buffer=new BufferedOutputStream(fout);
			long start=System.currentTimeMillis();
			//System.out.println(start);
			for(int i=0;i<1000;i++)
			{
				fout.write(65);
			}
			long stop=System.currentTimeMillis();
			buffer.close();
			System.out.println("BUFFER WRITE COMPLETE "+(stop-start));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
