package ���׸��ǽ�2;

class GenericMethods {

	// ���� TŸ�� �Է¸ŰԺ��� T Ÿ��
	public <T> T method1(T t) {
		// ������ �״�� �����ϴ� ���׸� �޼���
		return t;
	}

	public <T> boolean method2(T t1, T t2) {
		// �޾ƿ� �Է¸ŰԺ����� ���� ������ true����,�ƴϸ� fales����
		return t1.equals(t2);
	}

	public <K, V> void method3(K k, V v) {
		System.out.println("���� ���׸� <K,V> : " + k + " " + v);
	}
}

public class GenericMethod {
	public static void main(String[] args) {
		// ���׸� �޼���� �� �޼��带 ȣ���Ҷ� Ÿ���� �����Ǵ°Ŵ�.
		GenericMethods g = new GenericMethods();
		// g��ü�� �����ؼ� method1�� ȣ���Ҷ� ���׸��� ��Ʈ��Ÿ������ �ش�
		String hello1 = g.<String>method1("�ȳ�");
		// �ٵ� ������ �ŰԺ����� �������̿��� ���׸��� int�� ���ڿ��� ������ ���׸���
		// String�̱� ������ <>���������ϴ�.
		String hello2 = g.method1("�ȳ�");
		int number = g.method1(5);

		boolean trueOrfalse = g.method2("�ȳ�", "�ȳ�");
		System.out.println(trueOrfalse);
		g.method3("����", 3);

	}
}
