package �̳�Ŭ����3;

class A {
	
	int a = 5;
	static int b = 7;
	
	static class B {
		
		void bcd() {
//			System.out.println(a); AŬ���� a������ static�� �ƴϱ� ������ staticŬ����B �ȿ��� a������ ������ ���Ѵ�.
			System.out.println(b);
			System.out.println("���� ��� �̳� Ŭ���� (static)");
		}
	}

}
