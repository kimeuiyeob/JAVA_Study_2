package �̳�Ŭ����;

public class AMain {
	
	public static void main(String[] args) { //�ν��Ͻ� ��� Ŭ����
		
		A a = new A();
		a.abc();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		
		A.B ab = a.new B();
		ab.bcd();
		System.out.println();
		System.out.println(a.getD());
		a.setD(10);
		System.out.println(a.getD());
		
//		================================
		
		ab.printVariable();
		
	}

}
