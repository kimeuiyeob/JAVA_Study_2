package �ڹ�API�Լ����������̽��ǽ�;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

	public static void main(String[] args) {

		// UnaryOperator<T> => TŸ���� �޾Ƽ� TŸ������ �����Ѵ�.
		UnaryOperator<String> uo1 = new UnaryOperator<>() {
			@Override
			public String apply(String t) {
				return t + "UnaryOperator�� TŸ���� �޾� TŸ���� �����ϴ� ģ��!";
			}
		};
		System.out.println(uo1.apply("�̰� "));
		// ���ٽ� ǥ��
		UnaryOperator<String> uo2 = str -> str + "UnaryOperator�� TŸ���� �޾� TŸ���� �����ϴ� ģ��!";
		System.out.println(uo2.apply("��� "));
	}
}
