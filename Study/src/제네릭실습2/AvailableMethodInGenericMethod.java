package ���׸��ǽ�2;

class A {
	public <T> void method(T t) {
		// Object �޼��常 ȣ�� ����
//		System.out.println(t.length()); <==�Ұ��� T�� StringŸ���� �ƴϱ⶧����
		System.out.println(t.equals(3));
	}
}

public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {

		A a = new A();
		a.method("�ȳ�");
		a.method(3);

	}
}
