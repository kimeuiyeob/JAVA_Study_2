package ���׸�Ŭ����_�������̽��ǹ���;

//���� ������ <T> T �޼����̸�(T t) {
// Ÿ�� T�� ����� �ڵ�
// }

//���� ������ <T> void �޼����̸�(T t) {
//Ÿ�� T�� ����� �ڵ�
//}

//���� ������ <T,V> T �޼����̸�(T t, V v) {
//Ÿ�� T�� ����� �ڵ�
//}

//���׸� �޼���� �޼��带 ȣ���Ҷ� Ÿ���� �������ִ°Ŵ�.	
public class ���ʸ��޼��� {

	public static void main(String[] args) {
		
		String hi = hello("�ȳ�~~");
		System.out.println(hi);

		int hello = hello(300); 
		System.out.println(hello);

		hello2("�ȳ�");
		
	}
	//�� ���ʸ� �޼��� ���ο����� �������� t�� �޼���� ObjectŬ���� �޼��常 ��밡���ϴ�.
//	public static <T> T kim(T t) {
//		t.length(); // <==���� ������ ����� �������� ���ʸ��� ��Ѱ�쵵 ���ü��ִµ� .length�� ��Ʈ��Ÿ�����θ� ��밡���ϱ⶧���̴�.
//		return t;
//	}
	
	//���� ���� ����ó�� .length�� �޼��� ���ο� ����ϰ� �ʹٸ� ���ʸ���<T>�� �ƴ� <String>���� ����������Ѵ�.
	
//	========================================

	public static <T> T hello(T t) {
		return t;
	}

	public static <T> void hello2(T t) {
		System.out.println(t);
	}

}
