package �˰���_����;

import java.util.Arrays;

public class ��������_2 {

	public static void main(String[] args) {

		int[] selectArr = { 2, 1, 4, 3 };

		for (int i = 0; i < selectArr.length; i++) {
			for (int j = i + 1; j < selectArr.length; j++) {
				if (selectArr[i] < selectArr[j]) {
					int temp = selectArr[i]; 
					selectArr[i] = selectArr[j];
					selectArr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(selectArr));

	}
}
