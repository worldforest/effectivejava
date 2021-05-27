package com.serim.item10;

import java.awt.Color;
import java.util.Scanner;

/**
 * @author tmax Transitivity 추이성
 */

class Point {
	private int y, x;

	public Point(int y, int x) {
		this.y = y;
		this.x = x;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point))
			return false;
		Point p = (Point) obj;
		return p.x == x && p.y == y;
	}
}

class ColorPoint extends Point {

	private Color color;

	public ColorPoint(int y, int x, Color color) {
		super(y, x);
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {

		// 그냥 ColorPoint와 Point비교하면 ClassCastError발생
		if (!(obj instanceof ColorPoint))
			// ColorPoint가 아니면 Point의 equals로 비교
			// color무시하고 y, x만 비교
			return obj.equals(this);

		// ColorPoint이면 y,x,color 다 비교
		return super.equals(obj) && ((ColorPoint) obj).color == color;
	}

}

public class TransitivityError {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Point 비교");
		// System.out.println("첫번째 좌표의 (y, x) : ");
		// int y = sc.nextInt();
		// int x = sc.nextInt();
		// Point p1 = new Point(y, x);

		ColorPoint p1 = new ColorPoint(1, 2, Color.MAGENTA);
		Point p2 = new Point(1, 2);
		ColorPoint p3 = new ColorPoint(1, 2, Color.ORANGE);
		Point p4 = new ColorPoint(1, 2, Color.WHITE);

		// color 무시하고 비교
		System.out.println("p1.equals(p2) : " + p1.equals(p2));
		System.out.println("p2.equals(p3) : " + p2.equals(p3));
		// 둘 다 ColorPoint이니까 color도 비교
		System.out.println("p1.equals(p3) : " + p1.equals(p3));
		//ColorPoint로 선언한 CP - Point로 선언한 CP
		System.out.println("p1.equals(p4) : " + p1.equals(p4));
		//Point로 선언한 P - Point로 선언한 CP
		System.out.println("p2.equals(p4) : " + p2.equals(p4));
	}
}