package �˰���;

import java.util.Arrays;

//������ �ð��� �������� ���������� �ϰ�, �ݺ��� �ϸ鼭 ������ ������ ��
public class ��ݽý��� {
	public int solution(int[][] targets) {
		int answer = 0;

		System.out.println("���� �� : " + Arrays.deepToString(targets));

		Arrays.sort(targets, (o1, o2) -> {
			// �迭�� �� ��° ������ �����ϱ� ���� �� ����
			// (���� 0 : x == y) (���� -1 : x < y) (���� 1 : x > y)
			int compareVal = Integer.compare(o1[1], o2[1]);

			// ���� �� ��° ���� ������ ù ��° ���� ���Ͽ� ����
			if (compareVal == 0) {
				return Integer.compare(o1[0], o2[0]);
			}

			// �� ��° ���� �ٸ��� �� ��° ���� �������� ����
			return compareVal;
		});

		System.out.println("���� �� : " + Arrays.deepToString(targets));

		int end = targets[0][1];
		System.out.println("end : " + end);
		answer++; // ù ��°�� ��������� ��� �ý���

		for (int[] target : targets) {
			if (target[0] >= end) {
				end = target[1];
				answer++; // ������ ��� �ý����� ���Ѻ��� �����ʿ� �ֱ� ������ ���ο� ��� �ý��� �߰�
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		��ݽý��� s = new ��ݽý���();
		System.out.println(
				s.solution(new int[][] { { 5, 6 }, { 4, 8 }, { 10, 14 }, { 11, 13 }, { 5, 12 }, { 3, 7 }, { 1, 4 } }));
	}

}
