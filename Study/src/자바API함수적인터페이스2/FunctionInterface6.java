package �ڹ�API�Լ����������̽�2;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;

public class FunctionInterface6 {
	public static void main(String[] args) {

		// UnaryOperator ����Ÿ���� �޾Ƽ� ���� Ÿ������ ����
		IntUnaryOperator iuo = number -> number + 5;
		LongUnaryOperator luo = number -> number + 20L;
		DoubleUnaryOperator duo = number -> number + 10.0;

		System.out.println(iuo.applyAsInt(5));
		System.out.println(luo.applyAsLong(10L));
		System.out.println(duo.applyAsDouble(5.0));

		// BinaryOperator ���� Ÿ�� 2�� �޾Ƽ� ���� Ÿ������ ����
		IntBinaryOperator bio = (number1, number2) -> number1 + number2;
		LongBinaryOperator lio = (number1, number2) -> number1 + number2;
		DoubleBinaryOperator dio = (number1, number2) -> number1 + number2;

		System.out.println(bio.applyAsInt(5, 5));
		System.out.println(lio.applyAsLong(5, 5));
		System.out.println(dio.applyAsDouble(5, 5));
	}
}
