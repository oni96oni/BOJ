package tested;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) {

	}

	public void client() {
		int port = 3000;
		String serverIP = null;
		try {
			byte[] addr = new byte[] {(byte)121, (byte)170, (byte)250, (byte)34};
			InetAddress serverIp = InetAddress.getByAddress(addr);

			Socket socket = new Socket(serverIP,port);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void server() {

		try {
			int port = 3000;
			ServerSocket server;
			server = new ServerSocket(port);
			
			byte[] addr = new byte[] {(byte)121, (byte)170, (byte)250, (byte)34};
			InetAddress serverIp = InetAddress.getByAddress(addr);
			
			InetSocketAddress serverIpPort = new InetSocketAddress(serverIp, port);
			server.bind(serverIpPort);
			while(true) {
				Socket client = server.accept();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void output() {
		FileWriter fw = null;

		try {
			fw = new FileWriter("test.txt", true);
			fw.write(97);
			fw.write(65);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
