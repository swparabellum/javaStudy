import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Q");
		f.setSize(500, 150);
		f.setLayout(new FlowLayout());
		Label lbl = new Label("1.�����ִ� �оߴ�?");
		Checkbox news1 = new Checkbox("����1",true);
		Checkbox news2 = new Checkbox("����2");
		Checkbox news3 = new Checkbox("����3");
		f.add(lbl);
		f.add(news1);
		f.add(news2);
		f.add(news3);
		Label lbl2 = new Label("2.���忡����Ƚ����");
		CheckboxGroup group1 = new CheckboxGroup(); //���ϼ���
		Checkbox news4 = new Checkbox("����4",group1,true);
		Checkbox news5 = new Checkbox("����5",group1,false);
		Checkbox news6 = new Checkbox("����6",group1,false);
		f.add(lbl2);
		f.add(news4);
		f.add(news5);
		f.add(news6);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {//�͸� Ŭ����
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e); 
				System.exit(0);
			}
		}); 

	}
}
