package �˰���_Ž��;

public class ����Ž�� {

	// �⺻������ ���ĵǾ��ִ� �迭�� ��� �߶� ���� ���ϰ� �̷����̴�.
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int number = binarySearch(arr, 10);
		System.out.println("�˻� ī��Ʈ : " + number);
	}

	public static int binarySearch(int[] arr, int number) {

		int cnt = 0; // �˻� ����
		int left = 0;
		int right = arr.length - 1;

		while (true) {

			int mid = (left + right) / 2;
			cnt++;

			if (number == arr[mid]) {
				System.out.println("ã�Ҵ�!!");
				break;
			}
			if (number < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return cnt;
	}

}
