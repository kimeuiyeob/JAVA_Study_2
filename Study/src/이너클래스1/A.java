package �̳�Ŭ����1;

class A {

	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;

	void abc() {
		System.out.println("AŬ���� �޼���");
	}
	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	class B {
		
		public int a = 7;
		protected int b = 8;
		int c = 9;
		
		void printVariable() {
			
			System.out.println(this.a);
			System.out.println(this.b);
			System.out.println(this.c); //�� ����
			System.out.println("======");
			System.out.println(A.this.a);
			System.out.println(A.this.b);
			System.out.println(A.this.c); //�θ� ����
		}
		
		
		void bcd() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			abc();
		}
	}
}