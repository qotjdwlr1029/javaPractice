package com.chapter3;

public class WriteEx {

	public static void main(String[] args) {
		System.out.write(65);//65�� ���ۿ� ����
		System.out.flush();// ���ۿ� �ִ� ���� ����ض�
		System.out.println();
		byte[] by = {'J','A','V','A'};
		System.out.write(by,1,3);
		// byte�迭�� �� by �迭�� 1�� �ε��� ���� 3�� ����Ѵ�.
		// ����Ʈ �迭 ����� ��쿡�� �����÷��� ����� �ִ�.
		System.out.println();
	}

}
