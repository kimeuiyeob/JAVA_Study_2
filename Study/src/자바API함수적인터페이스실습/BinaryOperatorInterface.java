package �ڹ�API�Լ����������̽��ǽ�;

import java.util.function.BinaryOperator;

public class BinaryOperatorInterface {
	public static void main(String[] args) {

		// BinaryOperator<T> => TŸ���� �ΰ� �޾Ƽ� TŸ������ �����Ѵ�.
		BinaryOperator<String> bo1 = new BinaryOperator<>() {
			@Override
			public String apply(String t, String u) {
				return t + u;
			}
		};
		System.out.println(bo1.apply("������ ", "�ݰ����ϴ�."));

		BinaryOperator<Integer> bo2 = (number1, number2) -> number1 + number2;
		System.out.println("�μ��� ����? " + bo2.apply(5, 5));
	}

}
