package �ڹ�API�Լ����������̽��ǽ�;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {

		// Predicate�� �տ� Consumer�� Supplier���� �ٸ���.
		// Consumer�� �Է¸ŰԺ����� �ް� ������ ������.
		// Supplier�� �Է¸ŰԺ����� ���� ������ �־���.
		// �׷��� Predicate�� �Է¸ŰԺ����� �ް� �׿����� booleanŸ������ �����Ѵ�.

		// �⺻�� Predicate ���ٽ� ǥ��
		Predicate<String> pre = str -> str.length() > 5 ? true : false;
		boolean answer = pre.test("����5���ڰ�������?");
		System.out.println("���� : " + answer);

		// Ȯ����
		IntPredicate pre1 = number -> number > 5 ? true : false;
		LongPredicate pre2 = number -> number > 5 ? true : false;
		DoublePredicate pre3 = number -> number > 5 ? true : false;
		BiPredicate<Integer, Integer> pre4 = (number1, number2) -> (number1 + number2) > 5 ? true : false;

		System.out.println(pre1.test(10));
		System.out.println(pre2.test(3L));
		System.out.println(pre3.test(6.0));
		System.out.println(pre4.test(2, 2));

	}

}
