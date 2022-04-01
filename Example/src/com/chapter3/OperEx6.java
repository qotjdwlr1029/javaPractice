package com.chapter3;

public class OperEx6 {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int max;
		
		max = a > b ? ++a : ++b;
		System.out.println("max : " + max);
		System.out.println("a : "+a);
		System.out.println("b : " + b);
	}

}
