package ��Ʈ��API;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamPractice {
	public static void main(String[] args) {

		// JAVA8�� �߰��� Stream API�� Ȱ���ϸ� �پ��� ������ �ҽ��� ǥ��ȭ�� ������� �ٷ���ִ�.
		// ����, Collection F/W �� ���� �����ϴ� �����͸� ó���ϱ� ���� �ַ� ����Ѵ�.
		// Stream API�� Ȱ���� ���� ������ �پ��� �����͸� Ȱ���ϴµ� �־ �����ϰ� �������ִ� ó���� �����ϴ�.
		// Stream API�� �پ��� ��ɵ��� ��κ� ���ٸ� �ʿ�� �ϱ� ������ ���ٸ� �����ϰ� ����Ҽ� �־���Ѵ�.

		List<String>  names = Arrays.asList("���ǿ�", "������", "������");

		Iterator iter = names.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();

		// stream Ȱ��!
		names.stream().forEach(i -> System.out.print(i + " "));

	}

}
