package com.serim.item09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class trycatch {

	public static void main(String[] args) throws IOException {
		FileReader reader = null;
		try {
			reader = new FileReader("test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (true) {
			int data = reader.read();
			if (data == -1) {
				break;
			}
			char ch = (char) data;
			System.out.println(ch);
		}
		reader.close();
	}
}