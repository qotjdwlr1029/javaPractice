package com.chapter2;

public class CharEx {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = '\u0041';
		
		System.out.println("ch1 + ch2 = " + ch1 + ch2);
		System.out.println("ch1 + ch2 = " + (ch1 + ch2));
		//계산이 가능할 경우 숫자로 변경
		System.out.println("ch1 + ch2 = " + (char)(ch1 + ch2));
	}

}
