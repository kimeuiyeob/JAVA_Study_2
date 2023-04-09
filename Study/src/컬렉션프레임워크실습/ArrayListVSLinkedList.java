package �÷��������ӿ�ũ�ǽ�;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {
	public static void main(String[] args) {

		List<Integer> arraylist = new ArrayList<>();
		List<Integer> linkedlist = new LinkedList<>();
		// => �� �����͸� �߰��ϰų� �����Ҷ��� LinkedList�� �е������� ������.
		// �׷��� �����͸� �˻��Ҷ��� �ε����� �ٷ� ã�ƿ��� ArrayList�� ������.

		long startTime = 0, endTime = 0;

		// 1 ArrayList LinkedList������ �߰� �ð� ��

		// �̷��� ArrayList�� LinkedList�� ���� ū ���̴� �����͸� �߰��Ҷ� �ξ��� ������ �������ִ�.
		// ������ ArrayList�� 0��°�� ���� ��ԵǸ� ������ �־��� ������ �ε����� ��ĭ�� �� �з��� �� ������ ����.
		// ������ LinkedList�� �յ� �������� ���� �߰��ϴ°Ŷ� �ξ� ������ ���°Ŵ�.
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			arraylist.add(0, i);
		}
		endTime = System.nanoTime();
		System.out.println("1.ArrayList ������ �߰� �ð� : " + (endTime - startTime));

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedlist.add(0, i);
		}
		endTime = System.nanoTime();
		System.out.println("1.LinkedList ������ �߰� �ð� : " + (endTime - startTime));

		// ==================================================
		// 2 ArrayList LinkedList������ �˻� �ð� ��

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			arraylist.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("2.ArrayList ������ �˻� �ð� : " + (endTime - startTime));

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedlist.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("2.LinkedList ������ �˻� �ð� : " + (endTime - startTime));
	}
}
