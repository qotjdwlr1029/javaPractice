package com.chapter2;

public class CharEx {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = '\u0041';
		
		System.out.println("ch1 + ch2 = " + ch1 + ch2);
		System.out.println("ch1 + ch2 = " + (ch1 + ch2));
		//����� ������ ��� ���ڷ� ����
		System.out.println("ch1 + ch2 = " + (char)(ch1 + ch2));
	}

}