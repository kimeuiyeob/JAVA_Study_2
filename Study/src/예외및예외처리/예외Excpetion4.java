package ���ܹ׿���ó��;

import java.io.InputStreamReader;

public class ����Excpetion4 {

	public static void main(String[] args) {

		// ���ҽ� �ڵ����� ����ó�� ( try with resource) / �̰� try(����ٰ� �ִ°�)

		// try(����ٰ� System.in�� ���� �Ǹ� try catch���� ������ �˾Ƽ� .close�� �������ش�.)
		// ���� �ȿ��� .close��� abstract �޼ҵ尡 �־�� ()�ȿ� �����ִ�.
		// ���� ��� A a = new A();�̰� a�� close�� ���� ������ ���� ����.
		// AutoCloseable�̶�� Ŭ������ ������ �־�ߵȴ�. ����ȿ� close()�� �ִ�.

		try (InputStreamReader ISR = new InputStreamReader(System.in)) {
			System.out.println(ISR.read());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����~~");
		}
		 
		
		
		
		
		
		
		
		
	}
}
