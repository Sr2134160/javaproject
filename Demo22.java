package com.java.exampleprogramms;

public class Demo22 {
	public static void test() {
		int a = 12;
		int b = 16;
		int c;
		c = a + b;
		System.out.println("sum of a and b is :" + c);

	}

	public void test1() {
		float c = 20.6f, d = 30.6f, e;
		e = c - d;

		System.out.println("the difference of c and d :" + e);

	}

	public static void main(String[] args) {
		test();
		Demo22 tt = new Demo22();
		tt.test1();

	}

}
