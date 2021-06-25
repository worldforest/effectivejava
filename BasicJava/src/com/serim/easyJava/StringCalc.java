package com.serim.easyJava;

public class StringCalc {

	public static void main(String[] args) {
		String str1 = "Serim";
		String str2 = "Power";
		String result1 = str1 + str2;
		String result2 = str1.concat(str2);
		System.out.println("result1: " + result1 + ", result2 : " + result2);
		System.out.println(result1 == result2);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(result1.hashCode());
		System.out.println(result2.hashCode());

		String s1 = "Ha";
		String s2 = "Ha";
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}