package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestValidation {
	public static void main(String[] args) {
		int roll = 120;
		String str = String.valueOf(roll);
		System.out.println(str);

		String input = "8876543313";
		Pattern pattern = Pattern.compile("[7-8-9][0-9]{9}");
		Matcher matcher = pattern.matcher(input);
		System.out.println(matcher.matches());
	}
}
