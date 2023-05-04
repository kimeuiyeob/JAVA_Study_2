package UDP���;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPrecieve {
	
	public static void main(String[] args) {

		System.out.println("<Ŭ���̾�ƮB> - Text");

		// 1.DatagramSocket ���� (binding 20000)
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(20000);
		} catch (SocketException e) {
			;
		}

		// 2. DatagramPacket ����
		byte[] receivedData = new byte[66508];
		DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);

		try {
			ds.receive(receivedPacket);
		} catch (IOException e) {
			;
		}

		// 3.���� ������ ���� + DatagramPacket ����(������ �ּ� = ���� ��Ŷ�� ������ ���� ����)
		System.out.println("���ŵ����� : " + new String(receivedPacket.getData()).trim());

		byte[] sendData = "�ݰ����ϴ�".getBytes();
		// receivedPacket.getSocketAddress()�� send���� ���� ���� �ּҸ� �������� ���ּҷ� �ٽ� ������ �����°Ŵ�.
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivedPacket.getSocketAddress());

		// 4. �����ͱ׷���Ŷ ����
		try {
			System.out.println("�۽ŵ����� : " + new String(sendPacket.getData()).trim());
		} catch (Exception e) {
			;
		}
	}

}
