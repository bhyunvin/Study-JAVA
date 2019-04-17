package tj.exam.ex01;

class C {
	int i = 10;

	void m() {
		int i = 20;
		System.out.println(i); // 전역변수 < 지역변수
		System.out.println(this.i);
		/*
		 * 인스턴스 자신을 의미하는 this
		 * this를 붙이는 이유 : 변수의 이름이 같을 때 , 전역변수와 지역변수를 구분하기 위해서
		 * this가 붙어있는 것은 전역변수. 없는 것은 지역 변수.﻿
		 */
	}
}

public class ScopeDemo2 {
	public static void main(String args[]) {
		C c1 = new C();
		c1.m();
	}
}
