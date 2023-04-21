package ��Ʈ��API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomersStream2 {
	public static void main(String[] args) {

		List<Customers> customers = new ArrayList<>();
		customers.add(new Customers("���ǿ�", 61));
		customers.add(new Customers("������", 15));
		customers.add(new Customers("������", 53));
		customers.add(new Customers("�躴��", 23));
		customers.add(new Customers("������", 87));
		customers.add(new Customers("���ǿ�", 87));

		// customers��ü���� map()�� ���� �̸��� �����ѵ� .collect(Collectors.toList()
		// ����Ͽ� ����Ʈ ���·� ��ȯ�� ���� namesList�� ��´�.
		List<String> namesList = customers.stream().map(Customers::getName).collect(Collectors.toList());
		for (String name : namesList) {
			System.out.println("�̸� ���� �ȷ� : " + name);
		}
		System.out.println();
		Stream<String> nameStream = namesList.stream();
		nameStream.forEach(name -> System.out.println("�̸� ���� �ȷ� : " + name));

	}
}
