package �ڹ�API�Լ����������̽�2;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {

//		�͸� �̳�Ŭ����
//		Function<String, Integer> f;
//		f = new Function<>() {
//			@Override
//			public Integer apply(String t) {
//				return t.length();
//			}
//		};
//		System.out.println(f.apply("�ȳ�"));

//		���ٽ� ǥ��
		Function<String, Integer> f;
		f = (t) -> t.length();

		System.out.println(f.apply("�ȳ��ϼ���"));

	}
}
//Function�������̽��� TŸ������ �޾Ƽ� ������ RŸ������ �Ѵٰ� �����ϸ� �ȴ�.
//�� ���� Function�������̽��� �����Ҷ� <String,Integer>�� �����ؼ� f�� ����־���.
//�̶� �޼��� ������ ���� ����Ÿ���� Integer�� �ؼ� �����Ѱ��� �����ִ�.
//interface Function<T, R> {
//	public abstract R apply(T t);
//}
