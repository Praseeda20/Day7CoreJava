package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class ReadFile {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("login.properties");
		BufferedReader br = new BufferedReader(fr);
		HashMap<String, String> map = new HashMap<String, String>();
		String str = null;
		while ((str = br.readLine()) != null) {
			String slice[] = str.split("=");
			map.put(slice[0], slice[1]);
		}
		br.close();
		System.out.println(map);
		System.out.println("Username= "+map.get("username"));
		System.out.println("Password= "+map.get("userpass"));
		System.out.println("User Mail= "+map.get("usermail"));
	}
}
