package �˰���_DFS;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFS_1 {

	static boolean visited[]; // �湮 �迭
	static List<Integer>[] A;

	public static void main(String[] args) throws IOException {
		
		//��� 6 ���� 5
		// 1 2
		// 2 5
		// 5 1
		// 3 4
		// 4 6

		Scanner sc = new Scanner(System.in);
		
		System.out.println("��Ʈ ������ ���� ���� �Է�!");

		int n = sc.nextInt(); // n = ��� ����
		int m = sc.nextInt(); // m = ���� ����(��)

		visited = new boolean[n + 1];
		
		A = new ArrayList[n + 1];

		for (int i = 1; i < n + 1; i++) {
			A[i] = new ArrayList<>();
		}

		System.out.println("��� �� �Է�!");
		for (int i = 0; i < m; i++) {
			int start = sc.nextInt(); // ������
			int end = sc.nextInt(); // ��������
			A[start].add(end);
			A[end].add(start);
		}

		int cnt = 0;

		for (int i = 1; i < n; i++) {
			if (!visited[i]) {
				cnt++;
				DFS(i);
			}
		}

		System.out.println("��� : " + cnt);
	}

	private static void DFS(int idx) {
		if(visited[idx]) { //�⺻���� false�� �Ǿ��ִµ� �湮�ؼ� true�� �ٲ��ٸ� �湮�ߴٴ� ���̶� return
			return;
		}
		visited[idx] = true; //�湮 �ߴٴ� ��
		for(int i : A[idx]) {
			if(!visited[i]) {
				DFS(i);
			}
		}

	}

}
