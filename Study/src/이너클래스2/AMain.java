package �̳�Ŭ����2;

public class AMain {
	public static void main(String[] args) { //�ν��Ͻ� ��� Ŭ����
		
		A a = new A();
		a.abc();
		
		A.B ab = a.new B();
		ab.abc();
		ab.bcd();
	}

}
