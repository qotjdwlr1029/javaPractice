package com.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputEx3 {

	public static void main(String[] args) throws IOException {
		String name;
		String age;
		String addr;
		String tel;
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.print("�̸� = ");
		name = br.readLine();
		System.out.print("���� = ");
		age = br.readLine();
		System.out.print("�ּ� = ");
		addr = br.readLine();
		System.out.print("��ȭ��ȣ = ");
		tel = br.readLine();
		System.out.println();
		System.out.println(name + "��");
		System.out.println(age + "�� �׿�");
		System.out.println(addr + "�� ��ô� ����");
		System.out.println(tel + "�� ��ȭ �帮�ڽ��ϴ�.");
	}

}
