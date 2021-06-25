package com.serim.easyJava;

class Calc {
	public void run(int a, int b) {
		System.out.println(a + b);
		// return a + b;
	}
}

class MyCalc extends Calc {
	public void run(int a, int b) {
		System.out.println(a - b);
		// return a - b;
	}
}

public class Inheritance {
	public static void main(String[] args) {
		MyCalc myCalc = new MyCalc();
		myCalc.run(100, 10);
	}
}