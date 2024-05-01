import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ip ="127.0.0.1";
		int port = 1111;
		try {
			Socket socket = new Socket(ip,port);
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			for(int i=1; i<=10;i++) {
				int j = dis.readInt();
				System.out.println("서버로부터 받아온 데이터ㅣ "+j);
			}
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
