package com.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputEx4 {

	public static void main(String[] args) throws IOException {
		int kor;
		int eng;
		int mat;
		int hap;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���� = ");
		kor = Integer.parseInt(br.readLine());
		System.out.println("���� = ");
		eng = Integer.parseInt(br.readLine());
		System.out.println("���� = ");
		mat = Integer.parseInt(br.readLine());
		hap = kor + eng + mat;
		System.out.println();
		System.out.println("���� = " + hap);
	}

}
