package ���ܹ׿���ó��;

public class ����Exception2 {
	public static void main(String[] args) {
		try {
			System.out.println(3/0);
			int a = Integer.parseInt("20A");
			
//			catch����� 2�� �Ἥ ������ ������ �̷��� or�����ڷε� 2����ó���� ������ �ִ�.
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("���ڴ� 0���� ������ �����ϴ�.");
			System.out.println("���ڷ� ��ȯ�Ҽ� �����ϵ�.");
		} catch (Exception e) { //Exception�� ��� ����ó���� �������ֱ⶧���� catch�׻� �������� ���д�.
			e.printStackTrace(); 
		}
		
		
		finally {
			System.out.println("���α׷� ����");
			System.exit(0);
		}
	}

}
