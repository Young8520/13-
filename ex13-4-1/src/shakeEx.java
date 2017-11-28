import javax.swing.*;
import java.awt.*;

public class shakeEx extends JFrame {
	private JFrame frame = new JFrame();
	private JPanel p = new JPanel();

	public shakeEx() {
		frame.setTitle("진동하는 프레임 만들기");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(100, 100);
		frame.add(p);
		
		Shake th = new Shake(frame);  //스레드 생성
		
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		th.start();  //스레드 시작
	}
	public static void main(String[] args) {
		new shakeEx();
	}
}
class Shake extends Thread {
	private JFrame f;
	public Shake(JFrame f) {
		this.f = f;
	}
	public void run() {
		while(true) {
			try {
				f.setLocation(150, 155);  //프레임을 컨텐트팬 내의 임의의 윛로 설정
				Thread.sleep(1);   //1초 동안 잠을 잔다.
				f.setLocation(155, 150);  //프레임을 컨텐트팬 내의 임의의 윛로 설정
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}
