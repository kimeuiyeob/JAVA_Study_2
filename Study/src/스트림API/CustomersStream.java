package ��Ʈ��API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomersStream {
	public static void main(String[] args) {

		// �߰� ���� distinct �ߺ����� �޼��带 ����ϱ� ���ؼ��� equals�����ǰ� �ʿ��ϴ�.
		// �߰� ���� sorted�� ����ϱ� ���ؼ��� CustomerŬ������ Comparable�������̽��� ��ӹ޾� compareTo�޼��带 �����ؼ�
		// Ȯ���� ��Ÿ� �������� ������ ��ų���� ������� �Ѵ�.�׷��� ������ �̸����� �������� ���̷� �������� �𸣱� ������ ������ �߻��Ѵ�.

		// ���� comparable�������̽��� �����ϱ� �ȴٸ�
		// sorted(Compatator.comparing(Customers::getName))�� ���� ���������� �༭ ���Ľ�Ű�� ������ִ�.

		// Age 30�̻� , ��������, �̸� ���
		List<Customers> customers = new ArrayList<>();
		customers.add(new Customers("���ǿ�", 61));
		customers.add(new Customers("������", 15));
		customers.add(new Customers("������", 53));
		customers.add(new Customers("�躴��", 23));
		customers.add(new Customers("������", 87));
		customers.add(new Customers("���ǿ�", 87));

		List<Customers> list = new ArrayList<>();
		for (Customers customer : customers) {
			if (customer.getAge() > 30) {
				list.add(customer);
			}
		}
//		Collections.sort(list);
//		for (Customers customer : list) {
//			System.out.println(customer.getName());
//		}
//		System.out.println();

//		=================================================
		// Stream Ȱ��!!

		List<String> customersNames = customers.stream()
				// ���͸�
				// �������� �ɷ��ش�.
				.filter(i -> i.getAge() > 30)
				// ����
				.sorted(Comparator.comparing(Customers::getAge))
				// �����ϰ��� �ϴ� ������ ����
				// Customers <= �������� or Ŭ����Ÿ�� , getName()�޼���
				.map(Customers::getName)
				// �����͵��� ��� ����Ʈ���·� ��ȯ
				.collect(Collectors.toList());

//		for (String name : customersNames) {
//			System.out.println(name);
//		}

		Stream<Customers> stream = customers.stream();
//		stream.filter(i -> i.getAge() > 30).sorted().map(Customers::getName).forEach(i -> System.out.println(i));
//		stream.filter(i -> i.getAge() > 30).map(Customers::getName).distinct().forEach(System.out::print);
//		long cnt = stream.filter(i -> i.getAge() > 20).count();
//		System.out.println("20�� �̻� ����� : " + cnt + "��");
//		stream.filter(i -> i.getName().equals("���ǿ�")).sorted().forEach(i -> System.out.println(i.getAge()));
		stream.filter(i -> i.getAge() > 60).filter(i -> i.getAge() < 90).sorted(Comparator.comparing(Customers::getAge))
				.map(Customers::getName).distinct().forEach(i -> System.out.println("�̸� : " + i));

	}
}
