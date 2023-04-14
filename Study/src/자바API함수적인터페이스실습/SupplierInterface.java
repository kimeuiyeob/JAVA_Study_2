package �ڹ�API�Լ����������̽��ǽ�;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SupplierInterface {
	public static void main(String[] args) {

		// Consumer�������̽��ʹ� �ٸ��� �Է¸ŰԺ����� ������ ���ϸ� �ִ°�
		// Supplier�������̽��̴�.
		// �ΰ����� �ݴ��� �����ϸ� �ȴ�.-> Consumer�� �ŰԺ���O ����X
		// -> Supplier�� �ŰԺ���X ����O
		// �͸��̳�Ŭ���� ǥ��
		Supplier s = new Supplier() {
			@Override
			public Object get() {
				return "�氡�氡";
			}
		};
		System.out.println(s.get());

		// �⺻��
		// ���ٽ� ǥ��
		Supplier s1 = () -> "�氡�氡2";
		// Supplier�� ���׸��� ���������ָ� object�� �����ȴٰ� �����ϸ�ȴ�.
		// �׷��� �Ʒ� ����Ÿ���� Object�� �����Ű� ���࿡ String���� �ް������
		// ���׸��� String���� ����������Ѵ�.
		Object getWithObject = s1.get();
		System.out.println(getWithObject);

		// Ȯ����
		BooleanSupplier s2 = () -> true;
		IntSupplier s3 = () -> 5;
		LongSupplier s4 = () -> 5L;
		DoubleSupplier s5 = () -> 0.5;

		System.out.println(s2.getAsBoolean());
		System.out.println(s3.getAsInt());
		System.out.println(s4.getAsLong());
		System.out.println(s5.getAsDouble());

	}
}
