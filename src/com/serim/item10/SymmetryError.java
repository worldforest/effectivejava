package com.serim.item10;

import java.util.Objects;

/**
 * @author tmax
 *	Symmetry 대칭성
 */
public class SymmetryError {
	String s;

	public SymmetryError(String s) {
		this.s = Objects.requireNonNull(s);
	}

	// Source(Alt+s/Alt+S) - Override
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CaseInsensitiveString)
			return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);
		if (obj instanceof String)
			return s.equalsIgnoreCase((String) obj);
		return false;
	}
	/*
	 * cis.equals(s) : true s.equals(cis) : false s.equalsIgnoreCase(s) : true
	 */

	public static void main(String[] args) {

		SymmetryError cis = new SymmetryError("LeeSerim");
		String s = "leeSeRim";
		System.out.println("cis.equals(s) : " + cis.equals(s));
		System.out.println("s.equals(cis) : " + s.equals(cis));
		// String의 equals는 CaseInsensitiveString을 처리할 수 없다.(대칭성 위반)
		// equals의 대칭성 : s.equals(x) = x.equals(s)결과가 같다.
		System.out.println("s.equalsIgnoreCase(s) : " + s.equalsIgnoreCase(s));
	}

}
