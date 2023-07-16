package �˰���_Ž��;

import java.util.Arrays;

public class ����Ž��_2 {

	public void ����Ž��(int[] number1, int[] number2) {
		for (int i = 0; i < number2.length; i++) {
			System.out.println(binarySearch(number1, number2[i]));
		}
	}

	public int binarySearch(int[] numberArr, int num) {

		Arrays.sort(numberArr);
		int left = 0;
		int right = numberArr.length - 1;

		while (left <= right) {

			int mid = (left + right) / 2;
			int midValue = numberArr[mid];

			if (num == midValue) { // ã������
				return 1;
			}
			if (num < midValue) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		����Ž��_2 s = new ����Ž��_2();
		s.����Ž��(new int[] { 4, 1, 5, 2, 3 }, new int[] { 1, 3, 7, 9, 5 });
	}

}
