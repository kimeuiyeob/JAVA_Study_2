package �÷��������ӿ�ũ����Ʈ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayList2 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			list1.add(i);
		}

		List<Integer> list2 = new ArrayList<>();

		for (int i = 4; i < 8; i++) {
			list2.add(i);
		}

		list2.addAll(list1); // ����Ʈ �ȿ� addAll�� ��ü�� �߰��Ҽ����ִ�/

		System.out.println(list2.toString());

//		list2.remove(5); // �̷��� �Ǹ� �ε��� 5�� ��������

		// ���� 5�� �������
		list2.remove(new Integer(5));
		System.out.println(list2);
		
		//����Ʈ�� �ٽ� �迭�� �ٲٴ� ����̴�. toArry()�ϸ� object�� ��ȯ�ϴϱ�
		//�̷��� �ϸ� Integer�迭�� ������ִ�.
		//�̶� �ε����� 0�̳� ����Ʈ ���̸�ŭ ����� �ȿ� ������ �״�� �迭�� �ٲ��.
		Integer[] listToArray = list2.toArray(new Integer[0]);
		Integer[] listToArray1 = list2.toArray(new Integer[list2.size()]);
		System.out.println(Arrays.toString(listToArray));
		
	}

}
