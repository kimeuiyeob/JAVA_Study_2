package �ڹ�API�Լ����������̽�2;

import java.util.function.BinaryOperator;

public class FunctionInterface5 {

	public static void main(String[] args) {

		// BinaryOperator�� �ΰ��� ���� Ÿ���� �޾Ƽ� �����Ѵ�.
		BinaryOperator<String> BO = (str1, str2) -> str1 + str2;
		System.out.println(BO.apply("����", "�������� �ɲ���!!"));

	}
}
