package �÷��������ӿ�ũ�ǽ�;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {
	public static void main(String[] args) {

		// ���1
		// List ����Ŭ������ �����ڸ� ����Ͽ� ��ü ����
		List<Integer> aList1 = new ArrayList<>();
		List<Integer> aList2 = new ArrayList<>(30);

		List<Integer> aList3 = new Vector<>();
		List<Integer> aList4 = new Vector<>(30);

		List<Integer> aList5 = new LinkedList<>();
//		List<Integer> aList6 = new LinkedList<>(30); <== linkedlist�� capacity�����Ҽ� ����.

		// ���2
		// Arrays Ŭ������ ���� �޼��� Ȱ�� (�������� ũ�⸦ �ٲܼ� ����.)
		// Arrays.asList() Array�� �迭�� �����⸦ List�� ���Ѵ����� listŸ�Կ� �����ѰŶ�� ����ȴ�.
		// �׷��� ���������δ� Array�̶� ����. �׷��� �������� ũ�⸦ �ٲܼ� ����.
		List<Integer> aList7 = Arrays.asList(1, 2, 3, 4, 5);
		List<String> aList8 = Arrays.asList("��", "ȭ", "��", "��", "��");
		// �������� ũ�⸦ �ٲܼ� ���°��� ���� �ٲܼ��ִ�.
		// �ᱹ�� ���������� �迭�� ����ִ°ű� ������ �迭�̶� �Ȱ��� �����ϸ� �ȴ�.
		aList8.set(0, "��");
		System.out.println(aList8);

	}
}
