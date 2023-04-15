package UDP���;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPsend {

	public static void main(String[] args) {

		System.out.println("<Ŭ���̾�ƮA> - Text");

		// 1.DatagramSocker ���� (binding ���� = 10000)
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(10000);
		} catch (SocketException e) {
			;
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("������ TEXT �Է����ּ���.");
		String text = sc.nextLine();

		// 2.���۵����� ���� + DatagramPacket ���� (������ �ּ� = "192.168.56.1", 20000)
		byte[] sendData = text.getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,
				new InetSocketAddress("192.168.56.1", 20000));

		// 3.�����ͱ׷���Ŷ ����
		try {
			System.out.println("�۽ŵ����� : " + new String(sendPacket.getData()).trim());
			// send()������ ������ ���
			ds.send(sendPacket);
		} catch (IOException e) {
			;
		}

		// 4.�����ͱ׷� ��Ŷ ����
		// �۽��� �����͸� �޾ƾ��ϴϱ� ū ����ڸ� �ϳ� �����ϰ� �޴´�.
		byte[] receivedData = new byte[65508];
		DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);

		try {
			// receive()������ ������ ���
			ds.receive(receivedPacket);
		} catch (IOException e) {
			;
		}

		System.out.println("���ŵ����� : " + new String(receivedPacket.getData()).trim());

	}

}
