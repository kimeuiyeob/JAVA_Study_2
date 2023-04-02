package �ڹ�API�Լ����������̽�;

public class SupplierMain {

//	1. consumer =  interface �Է��� �ִµ� ����� ����. / ����� ȭ������� �ƴ϶� ������ �ִ� ���� �ǹ��̴�.
//	2. supplier = �Է��� ���µ� ����� �ִ�.
//	3. predicate = �Է��� �ִµ� ����� true or false / �Էµ� ���� ������ ��������
//	4. function = �Է��� TŸ���ε� ����� RŸ������ ��� / ������ Ÿ���� ��ȯ��Ű�°Ŷ�� ����

	public static void main(String[] args) {

//		==========================================================================================

		Supplier<String> s = new Supplier<String>() { //�̳� Ŭ���� ����
			public String get() { //get�޼ҵ� ����
				return "Supplier<T> �������̽�1"; //"Supplier<T> �������̽�1" ���
			}
		};
		System.out.println(s.get());

		Supplier<String> s1;
		s1 = () -> "Supplier<T> �������̽�2";
		System.out.println(s1.get());
		
//		==========================================================================================
		
		Supplier<Integer> s3 = new Supplier<>() { //��Ʈ ��
			public Integer get() {
				return 5;
			}
		};
		System.out.println(s3.get());
		
		Supplier<Integer> s4;
		s4 = () -> 7;
		System.out.println(s4.get());
		
//		==========================================================================================
		
		Supplier<Boolean> s5 = new Supplier<>() {
			public Boolean get() {
				return true;
			}
		};
		System.out.println(s5.get());
		
		Supplier<Boolean> s6;
		s6 = () -> false;
		System.out.println(s6.get());
		
//		==========================================================================================
		
		Supplier<Double> s7 = new Supplier<>() {
			public Double get() {
				return 3.12345;
			}
		};
		System.out.println(s7.get());
		
		
		Supplier<Double> s8;
		s8 = () -> 5.12345;
		System.out.println(s8.get());
		
//		==========================================================================================
		

	}

}
