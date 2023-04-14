package �ڹ�API�Լ����������̽�2;

import java.util.function.UnaryOperator;

public class FunctionInterface4 {
	public static void main(String[] args) {

		// UnaryOperator<T>, BinaryOperatior<T> �Լ��� �������̽�
		// UnaryOperator<T> => �Է�Ÿ�� T ���Ÿ�� T

		// �͸��̳�Ŭ����
		UnaryOperator<String> UO2 = new UnaryOperator<>() {
			@Override
			public String apply(String t) {
				return t + " ���� ŷ��¯�̾�";
			}
		};
		System.out.println(UO2.apply("�氡�氡"));

		// ���ٽ� ǥ��
		UnaryOperator<String> UO = str -> str + " ���� �ǿ��̾�";
		System.out.println(UO.apply("�ȳ�"));

	}

}
//UnaryOperator<T> �������̽��� TŸ���� �޾Ƽ� TŸ������ �����Ѵ�.
//interface UnaryOperator<T> {
//	public abstract T apply (T t);
//}
