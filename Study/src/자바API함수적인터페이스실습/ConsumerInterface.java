package �ڹ�API�Լ����������̽��ǽ�;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerInterface {

	public static void main(String[] args) {

		// Consumer �Լ��� �������̽��� ����Ÿ���̾��� void�̴�.
		// �� �ŰԺ����� �޴°� �״�� ����ϴ� �����̴�.

		Consumer<String> con = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println("�̰� " + t + "�̴�");
			}
		};
		con.accept("consumer");

		Consumer<String> con1 = str -> System.out.println("�̰� " + str + "�̴�");
		con1.accept("���ٽ� consumer");

//		================================================

		IntConsumer ic1 = number -> System.out.println("int : " + number);
		LongConsumer lc1 = number -> System.out.println("long : " + number);
		DoubleConsumer dc1 = number -> System.out.println("double : " + number);
		BiConsumer bc1 = (number1, number2) -> System.out.println("biConsumer : " + number1 + " , " + number2);
		// BiConsumer<String,Integer>�̷��� ���׸��̷� �����ؼ� ����ص� ������
		// ������ �ŰԺ����� �����ϰ� �Ǹ� �����Ϸ��� �˾Ƽ� �����ϱ� ������ ���� �ȳ��൵ �ȴ�.
		ic1.accept(5);
		lc1.accept(5);
		dc1.accept(5);
		bc1.accept("�ȳ�", 5);

	}

}
