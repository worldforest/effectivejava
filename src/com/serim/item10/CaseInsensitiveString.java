package com.serim.item10;

import java.util.Objects;

public class CaseInsensitiveString {
	// 대소문자 구분 안 하는 String

	String s;

	public CaseInsensitiveString(String s) {
		this.s = Objects.requireNonNull(s);
	}

	// Source(Alt+s/Alt+S) - Override

	@Override
	public boolean equals(Object obj) {
		return obj instanceof CaseInsensitiveString && ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
	}
	/*
	 * cis.equals(s) : false
	 * s.equals(cis) : false
	 * s.equalsIgnoreCase(s) : true
	 */

	public static void main(String[] args) {

		CaseInsensitiveString cis = new CaseInsensitiveString("LeeSerim");
		String s = "leeSeRim";
		System.out.println("cis.equals(s) : " + cis.equals(s));
		System.out.println("s.equals(cis) : " + s.equals(cis));
		// String의 equals는 CaseInsensitiveString을 처리할 수 없다.(대칭성 위반)
		// equals의 대칭성 : s.equals(x) = x.equals(s)결과가 같다.
		System.out.println("s.equalsIgnoreCase(s) : " + s.equalsIgnoreCase(s));
	}

}
