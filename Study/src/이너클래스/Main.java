package �̳�Ŭ����;

public class Main {
	
	public static void main(String[] args) {
		
		InnerClass in = new InnerClass(); //InnerClass �ܺ� Ŭ���� ��ü ����
		
//		==================================
		InnerClass.A inA = in.new A(); //�ܺ�Ŭ����.����Ŭ���� ���� , �������� , �ܺ�Ŭ������ü. new ����Ŭ����(); �̷��� �ؼ� ���ٰ����ϴ�.
		inA.hello();
		
//		==================================
		InnerClass.A.AB inAB = inA.new AB();
		inAB.hello2(); 
		
		
	}

}
 