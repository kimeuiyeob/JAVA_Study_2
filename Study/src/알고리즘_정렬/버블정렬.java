package �˰���_����;

import java.util.Arrays;

public class �������� {

	// 2���� ¦��� ���ؼ� ���ڰ� �� ������ ������ ����°� ��������
	public static void main(String[] args) {

		int[] arr = { 5, 7, 9, 1, 4, 6, 2, 8, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("������ : " + Arrays.toString(arr));
		}
		
		System.out.println("======================");
		System.out.println("���� ���� �Ϸ� : " + Arrays.toString(arr));

	}

}
