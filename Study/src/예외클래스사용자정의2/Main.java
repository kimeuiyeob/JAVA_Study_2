package ����Ŭ�������������2;

import ����Ŭ�������������1.A;

public class Main {

	public static void main(String[] args) {

		A a1 = new A();

		try {
			a1.checkScore(150);
		} catch (Over100Exception | OverMinusException e) {
			System.out.println(e.getMessage());
		}

	}

}
