package ���ܹ׿���ó��;

import java.io.IOException;
import java.io.InputStreamReader;

public class ����Exception3 {

	public static void main(String[] args) {

		InputStreamReader is = null;

		try {
			System.out.println("�Է�");
			is = new InputStreamReader(System.in);// System.in�� �Է��ϸ� �ܼ��� �аڴ� ��� �ǹ�
			System.out.println(is.read());
		} 
		catch (IOException e) {
			e.printStackTrace(); // ���� ó��
		} 
		finally {

			if (is != null) {
				try {
					is.close(); //close()�� ������ is�� �ݳ��ϴ�.
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
