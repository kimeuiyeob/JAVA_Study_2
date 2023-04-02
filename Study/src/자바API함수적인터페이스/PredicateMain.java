package �ڹ�API�Լ����������̽�;

public class PredicateMain {

	public static void main(String[] args) {
		
		Predicate<String> p1 = new Predicate<>() {
			public boolean test(String t) {
				return (t.length() > 1) ? true : false;
			}
		};
		System.out.println(p1.test("�ȳ�")); //���ڿ����̰� 1���� ũ�� ������ true ���ϰ� ��ȯ
		
		Predicate<String> p2;
		p2 = (str) -> (str.length() > 1) ? true : false;
		System.out.println(p2.test("")); //���ڿ��� �������Ƿ� 1���� �۱⶧���� false�� ��ȯ
		
//		=========================================================================================
		
		Predicate<Integer> p3 = new Predicate<>() {
			public boolean test(Integer t) {
				return (t > 5) ? true : false;
			}
		};
		System.out.println(p3.test(7));
		
		Predicate<Integer> p4;
		p4 = t -> t > 5 ? true : false;
		System.out.println(p4.test(3));
		
//		=========================================================================================
		
		Predicate<Double> p5 = new Predicate<>() {
			public boolean test(Double t) {
				return (t > 3.5) ? true : false;
			}
		};
		System.out.println(p5.test(5.5));
		
		Predicate<Double> p6;
		p6 = t -> (t > 3.5) ? true : false;
		System.out.println(p6.test(2.5));
		
//		=========================================================================================
	}

}
