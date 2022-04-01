package com.chapter3;

public class WriteEx {

	public static void main(String[] args) {
		System.out.write(65);//65를 버퍼에 담음
		System.out.flush();// 버퍼에 있는 것을 출력해라
		System.out.println();
		byte[] by = {'J','A','V','A'};
		System.out.write(by,1,3);
		// byte배열로 된 by 배열을 1번 인덱스 부터 3개 출력한다.
		// 바이트 배열 사용의 경우에는 오토플러시 기능이 있다.
		System.out.println();
	}

}
