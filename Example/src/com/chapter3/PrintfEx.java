package com.chapter3;

public class PrintfEx {

	public static void main(String[] args) {
		int a = 100;
		char b = 'A';
		float c = 12.346f;
		String d = "�輺��";
		//c���� ������ �̿��Ͽ� ����ϴ� ���
		System.out.printf("a = %d�Դϴ�.%n",a);
		System.out.printf("b = %c = %d\n", b, (int)b);
		System.out.printf("c = %6.2f \n", c);
		System.out.printf("d = %s �Դϴ�.", d);
	}

}
