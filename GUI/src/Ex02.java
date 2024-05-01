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
		Label lbl = new Label("1.관심있는 분야는?");
		Checkbox news1 = new Checkbox("뉴스1",true);
		Checkbox news2 = new Checkbox("뉴스2");
		Checkbox news3 = new Checkbox("뉴스3");
		f.add(lbl);
		f.add(news1);
		f.add(news2);
		f.add(news3);
		Label lbl2 = new Label("2.극장에가는횟수는");
		CheckboxGroup group1 = new CheckboxGroup(); //단일선택
		Checkbox news4 = new Checkbox("뉴스4",group1,true);
		Checkbox news5 = new Checkbox("뉴스5",group1,false);
		Checkbox news6 = new Checkbox("뉴스6",group1,false);
		f.add(lbl2);
		f.add(news4);
		f.add(news5);
		f.add(news6);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {//익명 클래스
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e); 
				System.exit(0);
			}
		}); 

	}
}
