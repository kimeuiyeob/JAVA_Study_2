package ���ٽĽǽ�;

interface M {
	// B�� ����Ÿ���̹Ƿ� B��� ��ü�� ���ϵȴ�.
	B abc();
}

class B {
	B() {
		System.out.println("ù��° ������");
	}

	B(int k) {
		System.out.println("�ι�° ������");
	}
}

public class RefOfClassConstructor_1 {
	public static void main(String[] args) {
		// Ŭ���� ������ ����
		// �͸� �̳� Ŭ����
		M m = new M() {
			@Override
			public B abc() {
				return new B();
			}
		};
		// ���ٽ�
		M m1 = () -> new B();

		// Ŭ���� ������ ����
		M m2 = B::new;

		m.abc();
		m1.abc();
		m2.abc();

	}
}
