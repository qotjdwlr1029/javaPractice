package com.chapter3;

import java.io.IOException;

public class InputEx1 {

	public static void main(String[] args) throws IOException {
		System.out.print("문자입력 = ");
		char i = (char)System.in.read();
		System.out.println("ASCII Value = " + i);
		
	}

}
