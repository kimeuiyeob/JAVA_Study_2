package �̳�Ŭ����4;

class A {

	public static void main(String[] args) {

		A a = new A();
		a.abc();
	}
	
//	=========================================================

	C b1 = new B();

	void abc() {
		b1.bcd();
		b2.bcd();
	}

//	=========================================================

	C b2 = new C() { //�̸��� ���� �͸� �̳� Ŭ����
		public void bcd() {
			System.out.println("C�������̽��� ��ü ����");
		}
	};

//	=========================================================

	class B implements C {
		@Override
		public void bcd() {
			System.out.println("BŬ������ C�������̽� bcd() ���� �Ϸ�!");

		}

	}
}
