package �˰���_����;

import java.util.Arrays;

public class ��������_2 {

	public static void main(String[] args) {

		int[] bubbleArr = { 5, 5, 2, 3, 4, 1 };
		int cnt = 0;

		for (int i = 0; i < bubbleArr.length; i++) {
			for (int j = 0; j < bubbleArr.length - 1 - i; j++) {
				if (bubbleArr[j] > bubbleArr[j + 1]) {
					int temp = bubbleArr[j];
					bubbleArr[j] = bubbleArr[j + 1];
					bubbleArr[j + 1] = temp;
				}
				cnt++;
			}
		}
		System.out.println("�ݺ�Ƚ�� : " + cnt);
		System.out.println(Arrays.toString(bubbleArr));
	}
}
