package ��Ʈ��API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAssist {
	public static void main(String[] args) {
		
		// Age 30�̻� , ��������, �̸� ���
		List<Customers> customers = new ArrayList<>();
		customers.add(new Customers("���ǿ�", 61));
		customers.add(new Customers("������", 15));
		customers.add(new Customers("������", 53));
		customers.add(new Customers("�躴��", 23));
		customers.add(new Customers("������", 87));

		List<Customers> list = new ArrayList<>();
		for (Customers customer : customers) {
			if (customer.getAge() > 30) {
				list.add(customer);
			}
		}
		Collections.sort(list);
		for (Customers customer : list) {
			System.out.println(customer.getName());
		}

//		=================================================
		// Stream Ȱ��!!

		List<String> customersNames = 
				customers.stream()
				//���͸�
				//�������� �ɷ��ش�.
				.filter(i -> i.getAge() > 30)
				//����
				.sorted()
				//�����ϰ��� �ϴ� ������ ����
				//Customers <= �������� or Ŭ����Ÿ�� , getName()�޼���
				.map(Customers::getName)
				//�����͵��� ��� ����Ʈ���·� ��ȯ
				.collect(Collectors.toList());
		
		for (String name : customersNames) {
			System.out.println(name);
		}
		
	}
}
