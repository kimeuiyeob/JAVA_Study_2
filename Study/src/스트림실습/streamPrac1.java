package ��Ʈ���ǽ�;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class streamPrac1 {
	public static void main(String[] args) {

		// 1���� 10���� list�� ��� ���
		List<Integer> data1 = new ArrayList<>();
		IntStream.range(1, 11).forEach(i -> data1.add(i));
		System.out.println("data1 : " + data1);

		// 1~100���� Ȧ���� list�� ��� ���
		List<Integer> data2 = new ArrayList<>();
		IntStream.range(1, 101).filter(i -> i % 2 != 0).forEach(i -> data2.add(i));
		System.out.println("data2 : " + data2);

		// ABCDEF�� �� ���ں��� ���
		String abcdef = "ABCDEF";
		abcdef.chars().forEach(i -> System.out.print((char) i + " "));
		System.out.println();

		// A~F���� list�� ��� ���
		List<Character> data3 = new ArrayList<>();
		IntStream.range(65, 71).forEach(i -> data3.add((char) i));
		System.out.println("data3 : " + data3);

		// A~F���� �� D�����ϰ� ArrayList�� ��� ���
//		List<Character> data4 = new ArrayList<>();
//		IntStream.range(65, 71).map(i -> i == 68 ? 0 : i).forEach(i -> data4.add((char) i));
//		System.out.println("data4 : " + data4);

		// A~F���� �� D�����ϰ� ArrayList�� ��� ���
		List<String> data4 = Arrays.asList("A", "B", "C", "D", "E", "F");
		data4.stream().map(i -> i.equals("D") ? "" : i).forEach(i -> System.out.print(i + " "));
		System.out.println();

		// 5���� ���ڿ��� �Է¹��� �� ��� �ҹ��ڷ� ����
//		Scanner sc = new Scanner(System.in);
//		List<String> strList = new ArrayList<>();
//		for (int j = 0; j < 5; j++) {
//			strList.add(sc.next());
//		}
//		strList.stream().forEach(i -> System.out.println(i.toLowerCase()));

		// Apple, banana, Melon �� ù��° ���ڰ� �빮���� ���ڿ� ���
		List<String> fruitList = Arrays.asList("Apple", "banana", "Melon");
		fruitList.stream().filter(i -> i.charAt(0) >= 65).filter(i -> i.charAt(0) <= 90)
				.forEach(i -> System.out.print(i + " "));
		System.out.println();

		// �ѱ��� ������ ����
//		String hangle = "�����̻�����ĥ�ȱ�";
//		String data = "�ϰ��̻�";
//		data.chars().map(hangle::indexOf).forEach(i -> System.out.print(i + " "));

		// ������ �ѱ۷� ����
		String hangle = "�����̻�����ĥ�ȱ�";
		String data = "1024";
		data.chars().map(i -> (i - 48)).forEach(i -> System.out.print(hangle.charAt(i) + " "));

	}
}
