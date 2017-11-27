package com.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	public static void main(String[] args) {
		try {
			Properties props = new Properties();
			FileReader fr = new FileReader("login.properties");
			props.load(fr);
			String user = props.getProperty("username");
			String pass = props.getProperty("userpass");
			String mail = props.getProperty("usermail");
			System.out.println("USERNAME: "+user);
			System.out.println("PASSWORD: "+pass);
			System.out.println("USER MAIL: "+mail);
			props.setProperty("USERMOBILE", "9876543210");
			FileOutputStream fout=new FileOutputStream("test.properties");
			props.store(fout, "Added key value pair");
			props.list(System.out);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
