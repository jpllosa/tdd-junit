package com.blogspot.jpllosa;

public class MathFun {

	public int getGCF(int x, int y) {
		return (y == 0) ? x : getGCF(y, x % y);
	}
}
