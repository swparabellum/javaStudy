import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		ServerSocket serverSocket = new ServerSocket(1111);
		while(true){ //������ �Ǳ����� ���ѷ���
			Socket socket = serverSocket.accept();//Ŭ���̾�Ʈ ��û ���
		//Ŭ���̾�Ʈ ��û�� �߻��� ���� ��ü ����.
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			for(int i=1; i<=10; i++) {
				dos.writeInt(i);
			}
			socket.close();
		}
		}catch(Exception ex) {
			
		}
	}

}
