package �÷��������ӿ�ũ���ð�ť;

public class StackPractice2 {

	public static void main(String[] args) {
		A a = new A();
		a.abc();
		// ���ø޸� ��Ȳ ����
//		 abc�޼��带 �켱 ȣ���ϸ� a=3,b=6���� �����̵ǰ�
//		 ���� bcd�޼��带 ȣ���ϴϱ� b=6����ĭ�� �޼��� == ĭ���� ����
//		 ġ�� a=9,b=8 ������ȴ�.
//		 �׸��� bcd�޼��尡 ������ b=8,a=9�� ���󰡰� �״���
//		 b=6,a=3�� ���󰡴� �����̴�.
	}
}

class A {
	public static void abc() {
		int a = 3;
		int b = 5;
		bcd();
	}

	public static void bcd() {
		int a = 9;
		int b = 8;
	}

}
