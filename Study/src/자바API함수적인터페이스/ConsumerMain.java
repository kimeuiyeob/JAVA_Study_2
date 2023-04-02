package �ڹ�API�Լ����������̽�;

public class ConsumerMain {

//	1. consumer =  interface �Է��� �ִµ� ����� ����. / ����� ȭ������� �ƴ϶� ������ �ִ� ���� �ǹ��̴�.
//	2. supplier = �Է��� ���µ� ����� �ִ�.
//	3. predicate = �Է��� �ִµ� ����� true or false / �Էµ� ���� ������ ��������
//	4. function = �Է��� TŸ���ε� ����� RŸ������ ��� / ������ Ÿ���� ��ȯ��Ű�°Ŷ�� ����

//	unaryoperator / binaryoperator = ���� Ÿ���� ���� => �� ���길 �Ѵ�.

	public static void main(String[] args) {
//		=========================================================================================

		Consumer<String> c = new Consumer<String>() { // Consumer<T>�������̽��� ���޸𸮿� ����
			public void accept(String t) { // abstract�޼��� ����
				System.out.println(t);
			}
		};
		c.accept("Consumer<T> �Լ��� �������̽�1");

		Consumer<String> c1;
		c1 = str -> System.out.println(str); // ���� ǥ��
		c1.accept("Consumer<T> �Լ��� �������̽�2");

//		==========================================================================================
		
		Consumer c2 = num ->  System.out.println("IntConsumer �� : " + num); //IntConsumer
		c2.accept(3);
		
		Consumer c3 = num ->  System.out.println("LongConsumer �� : " + num); //LongConsumer
		c3.accept(5L);
		
		Consumer c4 = num ->  System.out.println("DoubleConsumer �� : " + num); //DoubleConsumer
		c4.accept(1.23456);
		
		BiConsumer<String, Integer> c5 = (name,age) ->  System.out.println("�̸� : " + name + " ���� : " + age); //BiConsumer
		c5.accept("���ǿ�",5);
		
		
	}

}
