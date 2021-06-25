package com.serim.easyJava;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "Serim";
		String str2 = "Serim";
		boolean result1 = str1 == str2;
		System.out.println("리터럴로 생성: " + result1);

		String str3 = new String("Serim");
		String str4 = new String("Serim");
		boolean result2 = str3 == str4;
		System.out.println("객체 생성: " + result2);
	}
}
