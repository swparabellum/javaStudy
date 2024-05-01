import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		ServerSocket serverSocket = new ServerSocket(1111);
		while(true){ //데몬이 되기위한 무한루프
			Socket socket = serverSocket.accept();//클라이언트 요청 대기
		//클라이언트 요청이 발생시 소켓 객체 생성.
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
