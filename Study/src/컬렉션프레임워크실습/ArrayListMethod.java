package �÷��������ӿ�ũ�ǽ�;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {

		List<String> listInt = new ArrayList<>();

		for (int i = 1; i < 5; i++) {
			listInt.add("�ȳ�" + i);
		}

		// .toArray()�ϰ� �Ǹ� Ÿ���� Object�̴�.
		// �׷��� Object�迭�� �޾�����ϴµ� ���� String�̳� Intger�� �޾ƾ��Ұ�쵵 �����Ŵ�.
		// String���� �����Լ��� ������ �������� .toArray(new String[0])
		// �̷��� String�迭��ü�� �����ؼ� String�迭�� ��°Ŵ�.
		// �̶� �迭�� ũ�⸦ �������ټ� ������ 0���� �����ҽÿ��� �ȿ� ����ŭ Ŀ���� �������.
		Object[] listToArray = listInt.toArray();
		// ����Ʈ�� �ٽ� �迭�� ���鶧 ����ϴ� �޼��尡 .toArray()�̴�.
		String[] listToArrayString = listInt.toArray(new String[10]);
		for (int i = 0; i < listToArrayString.length; i++) {
			if (listToArrayString[i] == null) {
				System.out.println("null������~");
			} else {
				System.out.println(listToArrayString[i]);
			}
		}
		System.out.println();

		String[] listToArrayString2 = listInt.toArray(new String[0]);
		for (int i = 0; i < listToArrayString2.length; i++) {
			if (listToArrayString2[i] == null) {
				System.out.println("null������~");
			} else {
				System.out.println(listToArrayString2[i]);
			}
		}

	}

}
