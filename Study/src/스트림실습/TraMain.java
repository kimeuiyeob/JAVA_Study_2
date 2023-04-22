package ��Ʈ���ǽ�;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TraMain {

	public static void main(String[] args) {

		Trader ���ǿ� = new Trader("���ǿ�", "���");
		Trader ������ = new Trader("������", "��");
		Trader ������ = new Trader("������", "���");
		Trader ������ = new Trader("������", "����");

		List<Transaction> transactions = new ArrayList<>();
		transactions.add(new Transaction(������, 2011, 300));
		transactions.add(new Transaction(���ǿ�, 2012, 820));
		transactions.add(new Transaction(���ǿ�, 2011, 400));
		transactions.add(new Transaction(������, 2012, 710));
		transactions.add(new Transaction(������, 2012, 700));
		transactions.add(new Transaction(������, 2012, 950));

		// 2. 2011�⿡ �Ͼ ��� Ʈ������� ã�� ���� �������� ������������ �����Ͻÿ�.
//		transactions.stream().filter(i -> i.getYear() == 2011)
//				.sorted(Comparator.comparing(Transaction::getValue).reversed())
//				.forEach(i -> System.out.println(i.getTrader()));

		// 3. �ŷ��ڰ� �ٹ��ϴ� ��� ���ø� �ߺ� ���� �����Ͻÿ�.
//		transactions.stream().forEach(i -> System.out.println(i.getTrader().getCITY()));

		// 4. ��ǿ��� �ٹ��ϴ� ��� �ŷ��ڸ� ã�Ƽ� �̸������� �����Ͻÿ�.
//		transactions.stream().filter(i -> i.getTrader().getCITY().equals("���"))
//				.forEach(i -> System.out.println(i.getTrader().getName()));

		// ��� �ŷ����� �̸��� ���ĺ� �������� �����ؼ� ��ȯ�Ͻÿ�.
//		transactions.stream().map(i -> i.getTrader().getName()).sorted(Comparator.reverseOrder())
//				.forEach(i -> System.out.println(i));

		// 6. ���񱳿� �ŷ��ڰ� �ִ°�?
//		boolean answer = transactions.stream().anyMatch(i -> i.getTrader().getCITY().equals("����"));
//		System.out.println(answer);

		// 7. �񵿿� �����ϴ� �ŷ����� ��� Ʈ����� ���� ����Ͻÿ�.
//		transactions.stream().filter(i -> i.getTrader().getCITY().equals("��")).forEach(i -> System.out.println(i));

		// 8. ��ü Ʈ����� �� �ִ��� ���ΰ�?
//		Integer answer = transactions.stream().map(i -> i.getValue()).reduce(Integer.MIN_VALUE, Integer::max);
//		System.out.println(answer);

//		=======================================================================================================

//		    Trader raoul = new Trader("Raoul", "Cambridge");
//	        Trader mario = new Trader("Mario", "Milan");
//	        Trader alan = new Trader("Alan", "Cambridge");
//	        Trader brian = new Trader("Brian", "Cambridge");
//
//	        List<Transaction> transactions = Arrays.asList(
//	            new Transaction(brian, 2011, 300),
//	            new Transaction(raoul, 2012, 1000),
//	            new Transaction(raoul, 2011, 400),
//	            new Transaction(mario, 2012, 710),
//	            new Transaction(mario, 2012, 700),
//	            new Transaction(alan, 2012, 950)
//	        );
//	        
//		1. 2011�⿡ �Ͼ ��� Ʈ������� ã�� ���� ������������ �����Ͻÿ�.
//
//		List<Integer> answer1 = transactions.stream()
//		    .filter(t -> t.getYear() == 2011)
//		    .map(Transaction::getValue)
//		    .sorted()
//		    .collect(Collectors.toList());
//
//		System.out.println(answer1);
//		
//		2. 2011�⿡ �Ͼ ��� Ʈ������� ã�� ���� �������� ������������ �����Ͻÿ�.
//
//		List<Transaction> answer2 = transactions.stream()
//		    .filter(t -> t.getYear() == 2011)
//		    .sorted(Comparator.comparing(Transaction::getValue))
//		    .collect(Collectors.toList());
//
//		System.out.println(answer2);
//		
//		3. �ŷ��ڰ� �ٹ��ϴ� ��� ���ø� �ߺ� ���� �����Ͻÿ�.
//
//		List<String> answer3 = transactions.stream()
//		    .map(Transaction::getTrader)
//		    .map(Trader::getCITY)
//		    .distinct()
//		    .collect(Collectors.toList());
//
//		System.out.println(answer3);
//		
//		4. ���Ӻ긮������ �ٹ��ϴ� ��� �ŷ��ڸ� ã�Ƽ� �̸������� �����Ͻÿ�.
//
//		List<Trader> answer4 = transactions.stream()
//		    .map(Transaction::getTrader)
//		    .filter(trader -> trader.getCITY().equals("Cambridge"))
//		    .sorted(Comparator.comparing(Trader::getName))
//		    .collect(Collectors.toList());
//
//		System.out.println(answer4);
//		
//		5. ��� �ŷ����� �̸��� ���ĺ� �������� �����ؼ� ��ȯ�Ͻÿ�.
//
//		List<String> answer5 = transactions.stream()
//		    .map(Transaction::getTrader)
//		    .map(Trader::getName)
//		    .distinct()
//		    .sorted(Comparator.reverseOrder())
//		    .collect(Collectors.toList());
//
//		System.out.println(answer5);
//		
//		6. �ж�뿡 �ŷ��ڰ� �ִ°�?
//
//		boolean answer6 = transactions.stream()
//		    .anyMatch(t -> t.getTrader().getCITY().equals("Milan"));
//
//		System.out.println(answer6);
//		
//		7. ���Ӻ긮���� �����ϴ� �ŷ����� ��� Ʈ����� ���� ����Ͻÿ�.
//
//		List<Integer> answer7 = transactions.stream()
//		    .filter(t -> t.getTrader().getCITY().equals("Cambridge"))
//		    .map(Transaction::getValue)
//		    .collect(Collectors.toList());
//
//		System.out.println(answer7);
//		
//		8. ��ü Ʈ����� �� �ִ��� ���ΰ�?
//
//		Integer answer8 = transactions.stream()
//		    .map(Transaction::getValue)
//		    .reduce(0, Integer::max);
//
//		System.out.println(answer8);

	}
}
