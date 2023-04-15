package �ڹ�API�Լ����������̽��ǽ�;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

public class FunctionInterface {
	public static void main(String[] args) {
//		Function<T, R> => TŸ������ �Է¹޾Ƽ� RŸ������ �����Ѵ�.

		// �͸� �̳�Ŭ���� ǥ��
		Function<String, Integer> f1 = new Function<>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		System.out.println(f1.apply("�ȳ��ϼ���"));

		// ���ٽ� ǥ��
		Function<String, Integer> f2 = t -> t.length();
		System.out.println(f1.apply("�ȳ��ϼ���ݰ����ϴ�."));

		// Ȯ���� Function
		IntFunction<String> f3 = number -> number + "�� �ȳ�";
		System.out.println(f3.apply(5));
		LongFunction<Double> f4 = number -> number + 0.5;
		System.out.println(f4.apply(5));
		BiFunction<String, Integer, Integer> f5 = (str, number) -> (str.length() + number);
		System.out.println(f5.apply("�ȳ��ϼ���", 5));

	}

}
