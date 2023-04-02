package �÷��������ӿ�ũ��;

import java.util.TreeSet;

public class MyComparableClass implements Comparable<MyComparableClass> {

	int data1;
	int data2;

	public MyComparableClass(int data1, int data2) {
		super();
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	// Comparable�������̽��� ��ü���� �񱳸� �Ҽ��ִ�.
	// �������̽��Ƿ� �ȿ� �ִ� compareTo�Լ��� �����ؾ��Ѵ�.
	// => �Ķ���ͷ� �Ѿ�� ���̶� ���� ���̶� ���Ѵ�.
	public int compareTo(MyComparableClass o) {
		if (this.data2 < o.data2) {
			return -1;
		} else if (this.data2 == o.data2) {
			return 0;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {

		TreeSet<MyComparableClass> TS = new TreeSet<>();

		// ������ compareTo���� ������ data2�� �θ� ����Ҷ� data2�Ǳ������� ���ĵǼ� ���
		// �ݴ�� �ϸ� data1�� �������� ��µȴ�.
		MyComparableClass myClass1 = new MyComparableClass(2, 5);
		MyComparableClass myClass2 = new MyComparableClass(3, 3);

		TS.add(myClass1);
		TS.add(myClass2);

		for (MyComparableClass myComparableClass : TS) {
			System.out.println(myComparableClass.data2);
		}

	}
}
