package ���ٽĽǽ�;

interface T {
	// B�� ����Ÿ���̹Ƿ� B��� ��ü�� ���ϵȴ�.
	S abc();
}

class S {
	S() {
		System.out.println("ù��° ������");
	}

	S(int k) {
		System.out.println("�ι�° ������");
	}
}

public class RefOfClassConstructor_2 {
	public static void main(String[] args) {
		// Ŭ���� ������ ����
		// �͸� �̳� Ŭ����
		T m = new T() {
			@Override
			public S abc() {
				return new S();
			}
		};
		// ���ٽ�
		T m1 = () -> new S();

		// Ŭ���� ������ ����
		T m2 = S::new;

		m.abc();
		m1.abc();
		m2.abc();

	}
}
