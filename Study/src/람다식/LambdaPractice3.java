package ���ٽ�;

public class LambdaPractice3 {

	public static void main(String[] args) {

		AAA a = new AAA() {
			public void abc() {
				BBB b = new BBB();
				b.bcd();
			}
		};

		AAA a1 = () -> {
			BBB b = new BBB();
			b.bcd();
		};

		// Ŭ���� ��ü :: �ν��Ͻ� �޼��� �̸�
		AAA a2 = () -> {
			BBB b = new BBB();
			A a3 = b::bcd;
		};

	}
}

interface AAA {
	void abc();
}

class BBB {
	void bcd() {
		System.out.println("���� Ŭ���� BBB �޼����");
	}
}
