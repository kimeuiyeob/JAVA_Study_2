package �̳��������̽�;

class A {
	public static void main(String[] args) {
		
		A.B a = new A.B() { //�ܺ� Ŭ���� A���� �̳��������̽� B �����ؼ� �������� a�� ��ü ����
			@Override
			public void bcd() {
				System.out.println("�͸� Ŭ���� A�������̽� ���� �Ϸ�");
			}
		};
		a.bcd();

		C c = new C();
		c.bcd();
	}
	
	static interface B { //�̳� �������̽�
		void bcd();
	}
	
}
//===================================================================

class C implements A.B {  //Ŭ���� C�� AŬ���� ���ο� �ִ� B�������̽��� ��ӹ޴´�
	@Override
	public void bcd() {
		System.out.println("A�������̽� �޼��� ���� �Ϸ�");
	}
}
