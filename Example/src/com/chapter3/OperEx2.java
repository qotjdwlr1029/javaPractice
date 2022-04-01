package com.chapter3;

public class OperEx2 {

	public static void main(String[] args) {
		
		short a, b;
		a = b = 10;
		// byte, short, char, int 자료형 사이의 연산에서는 
		//결과가 int 임
		short c = (short)(a + b);
		System.out.println("c의 값 : " + c);

	}

}
/*
 * long, float, double 자료형이 연산되면 큰 자료형으로 결과가 결정 됨
 */
