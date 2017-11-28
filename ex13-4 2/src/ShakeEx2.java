import javax.swing.*;
import java.awt.*;

public class ShakeEx2 extends JFrame{
	public ShakeEx2() {
		setTitle("진동하는 레이블 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("진동레이블");
		label.setLocation(150,150);
		label.setSize(100,100);
		c.add(label);
		
		Shake2 th = new Shake2(label);  //스레드 생성
		
		setSize(350,350);
		setVisible(true);
		
		th.start();  //스레드 시작
	}
	public static void main(String[] args) {
		new ShakeEx2();
	}
	class Shake2 extends Thread {
		private JLabel label;  //글자가 나올 레이블 생성
		public Shake2(JLabel label) {
			this.label = label;
		}
		public void run() {
			while(true) {
				label.setLocation(150,155);
				label.setLocation(155, 150);  //진동이 나올수 있게 위치를 조금씩 변경
			}
		}
	}
}
