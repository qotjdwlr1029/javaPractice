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
		System.out.print("이름 = ");
		name = br.readLine();
		System.out.print("나이 = ");
		age = br.readLine();
		System.out.print("주소 = ");
		addr = br.readLine();
		System.out.print("전화번호 = ");
		tel = br.readLine();
		System.out.println();
		System.out.println(name + "씨");
		System.out.println(age + "세 네요");
		System.out.println(addr + "에 사시는 군요");
		System.out.println(tel + "로 전화 드리겠습니다.");
	}

}
