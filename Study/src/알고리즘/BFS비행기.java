package �˰���;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS����� {
	public int solution(int[][] flights, int s, int e, int k) {

		List<Integer> priceList = new ArrayList<>();
		Queue<int[]> queue = new LinkedList<>();

		queue.offer(new int[] { s, 0, k }); // ������, �ݾ�, ����

		while (!queue.isEmpty()) {

			int[] intArr = queue.poll();
			int start = intArr[0]; // ������
			int price = intArr[1]; // �ݾ�
			int stop = intArr[2]; // ����

			if (start == e) { // ���۰� �������� ������ ����
				priceList.add(price);
				continue;
			}

			if (stop == -1) {
				continue;
			}

			for (int i = 0; i < flights.length; i++) { // �������� �������� �ٱ��ִ� �ݺ���
				if (flights[i][0] == start) {
					queue.offer(new int[] { flights[i][1], price + flights[i][2], stop - 1 });
				}
			}
		}

		Collections.sort(priceList);
		return priceList.size() == 0 ? -1 : priceList.get(0);

	}

	public static void main(String[] args) {
		BFS����� T = new BFS�����();
		System.out.println(T.solution(new int[][] { { 0, 1, 10 }, { 1, 2, 20 }, { 0, 2, 70 }, { 0, 3, 100 },
				{ 1, 3, 80 }, { 2, 3, 10 }, { 2, 4, 30 }, { 3, 4, 10 } }, 0, 3, 1));
//		System.out.println(T.solution(new int[][] { { 0, 1, 10 }, { 0, 2, 10 }, { 1, 3, 5 }, { 2, 3, 3 } }, 0, 3, 0));
//		System.out.println(T.solution(new int[][] { { 0, 3, 10 }, { 1, 5, 10 }, { 1, 7, 100 }, { 0, 1, 10 },
//				{ 0, 2, 10 }, { 5, 7, 30 }, { 3, 7, 10 }, { 1, 3, 5 }, { 2, 3, 3 } }, 1, 7, 2));
	}
}