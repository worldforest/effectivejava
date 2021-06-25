package com.serim.easyJava;

class Test {
	public static int no = 0;
	public int nono = 0;

	public void print(int nono) {
		System.out.println(this.nono);
		//this.nono는 이 클래스의 nono 변수
		//그냥 nono를 출력하라고 하면 print메서드가 받은 파라미터를 출력
	}
}

public class StaticTest {
	public static void main(String[] args) {
		Test a = new Test();
		Test b = new Test();
		a.no = 10;

		System.out.println(b.no);

		Test c = new Test();
		c.print(10);
	}
}