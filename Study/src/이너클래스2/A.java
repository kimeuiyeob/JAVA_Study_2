package �̳�Ŭ����2;

public class A {

	int a = 3, b = 4;

	void abc() {
		System.out.println("���� AŬ������");
	}

	class B {
		
		int a = 5, b = 6;

		void abc() {
			System.out.println("���� BŬ������");
		}

		void bcd() {
			System.out.println(a);
			System.out.println(b);
			this.abc();
			System.out.println(A.this.a);
			System.out.println(A.this.b);
			A.this.abc();
		}
		
	}

}
