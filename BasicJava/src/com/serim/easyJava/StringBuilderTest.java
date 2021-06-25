package com.serim.easyJava;

public class StringBuilderTest {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode());
		sb.append("Happy");
		System.out.println("Happy => " + sb.hashCode());
		sb.append("Serim");
		System.out.println("HappySerim => " + sb.hashCode());

		StringBuilder sb2 = new StringBuilder("LUV");
		StringBuilder sb3 = new StringBuilder("LUV");
		System.out.println(sb2 == sb3);
		System.out.println(sb2.equals(sb3));
		System.out.println(sb2.toString().equals(sb3.toString()));

	}
}
