package �ڹ�API�Լ����������̽�2;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

public class FunctionInterface2 {
	public static void main(String[] args) {

		// Ȯ���� Function<T,R> �Լ��� �������̽�
		// �Է�Ÿ�� : T , ���Ÿ�� : R

//		IntFunction<R>		=>	�Է�Ÿ��(int)		=>	���Ÿ��(R)
//		LongFunction<R>		=>	�Է�Ÿ��(long)		=>	���Ÿ��(R) 
//		DoubleFunction<R>	=>	�Է�Ÿ��(double)	=>	���Ÿ��(R) 
//		BiFunction<R>		=>	�Է�Ÿ��(T,U)		=>	���Ÿ��(R) 
		// BiFunction<R>�� �Է�Ÿ���� 2���̴�.

		IntFunction<Double> f2 = (num) -> (double) num;
//								�Է���Int		�����double

		LongFunction<String> f3 = (num) -> String.valueOf(num);
//								�Է���Long	�����String

		BiFunction<String, Integer, String> f4 = (name, age) -> "�̸�: " + name + ", ����: " + age;
//					                 �Է���String,Integer		�����String
		
		Function<String,Integer> f5 = (str) -> str.length();
			//�Է��� String, ����� Integer

		System.out.println(f2.apply(5));
		System.out.println(f3.apply(5)); // ���ڿ� 5�� ��µȴ°Ŵ�.
		System.out.println(f4.apply("���ǿ�", 30));
		System.out.println(f5.apply("�氡�氡�ȳ�~"));

	}

}
