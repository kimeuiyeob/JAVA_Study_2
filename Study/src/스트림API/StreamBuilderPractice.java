package ��Ʈ��API;

import java.util.stream.Stream;

public class StreamBuilderPractice {

	public static void main(String[] args) {

		// Collection�� Stream.Builder�� ���� ū ����
		// ���� Collection ��ü�� ���� stream ��ü�� �����ϰ� �Ǹ�
		// �̹� ������ �ִ� �����͸� ������ ó���ϴ� ��찡 ��κ�������
		// Stream.Builder�� �����Ͱ� �������� �ʰ� stream��ü�� �����ؼ�
		// �� ��Ʈ���� �����͸� �߰��ؼ� ����ϴ� ����̴�.

		// �� Stream.Builder�� ��Ʈ�� ��ü������ �����͸� �����ϰ� ó���Ҽ� �ִ�.
		// Stream.Builder�������̽��� Cosumer�������̽��� ����ϰ� ������
		// �����͸� �߰��ϴ� accept(),add()�޼ҵ�� �������� �߰� �۾��� �Ϸ��ϰ�
		// stream�� ��ȯ�ϴ� build()�޼ҵ带 �����ϰ� �ִ�.
		
		Stream.Builder<String> streamBuilder = Stream.builder();
		streamBuilder.accept("kim");
		streamBuilder.accept("lee");
		streamBuilder.accept("song");
		streamBuilder.accept("park");
		// accept / add�� �Ѵ� �߰��ϴ� ����ε� ��ȯŸ�Ը� �ٸ��ٰ� �����ϸ�ȴ�.
		streamBuilder.add("hello");
		streamBuilder.add("hi");

		Stream<String> stream = streamBuilder.build();
		stream.forEach(i -> System.out.println("�̸� : " + i));

	}
}
