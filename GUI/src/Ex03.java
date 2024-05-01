import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("login");
		f.setSize(400, 100);
		f.setLayout(new FlowLayout());
		Label lid = new Label("아이디: ",Label.RIGHT);
		Label pwd = new Label("비밀번호: ",Label.RIGHT);
		TextField id = new TextField(10);
		TextField pw = new TextField(10);
		pw.setEchoChar('*');
		f.add(lid);
		f.add(id);
		f.add(pwd);
		f.add(pw);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0);
			}
		});
	}

}
