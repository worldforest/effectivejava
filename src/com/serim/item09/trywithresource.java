package com.serim.item09;

import java.io.FileReader;

public class trywithresource {
	public static void main(String args[]) {
		try (FileReader reader = new FileReader("test.txt")) {
			char[] arr = null;
			while (true) {
				int data = reader.read();
				if (data == -1) {
					break;
				}
				char ch = (char) data;
				while (ch != '\n') {

				}
				System.out.println(ch);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
