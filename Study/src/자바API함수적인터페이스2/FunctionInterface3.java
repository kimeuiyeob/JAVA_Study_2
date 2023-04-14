package �ڹ�API�Լ����������̽�2;

import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class FunctionInterface3 {
	public static void main(String[] args) {

		// To�� �տ� ������ �����̶� �ݴ�� �����ϸ�ȴ�.
		// �Ϲ� Ȯ���� Function�������̽� IntFunction<String>�̶��
		// IntegerŸ������ �Է¹����� ����� String���� �ߴ�.
		// ������ To�� ������ �Կ��� String������ �ް� ����� Integer�� �Ѵ�.
		ToIntFunction<String> f6 = str -> str.length();
		ToLongFunction<Double> f7 = doubleNumber -> doubleNumber.longValue();
		ToDoubleFunction<Integer> f8 = number -> (double) number;

		System.out.println(f6.applyAsInt("�ȳ��ϼ���"));
		System.out.println(f7.applyAsLong(0.5));
		System.out.println(f8.applyAsDouble(5));
		
	}
}
