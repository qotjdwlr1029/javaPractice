package com.chapter3;

public class PrintfEx {

	public static void main(String[] args) {
		int a = 100;
		char b = 'A';
		float c = 12.346f;
		String d = "배성직";
		//c언의 서식을 이용하여 출력하는 방법
		System.out.printf("a = %d입니다.%n",a);
		System.out.printf("b = %c = %d\n", b, (int)b);
		System.out.printf("c = %6.2f \n", c);
		System.out.printf("d = %s 입니다.", d);
	}

}
