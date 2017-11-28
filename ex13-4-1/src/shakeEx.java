import javax.swing.*;
import java.awt.*;

public class shakeEx extends JFrame {
	private JFrame frame = new JFrame();
	private JPanel p = new JPanel();

	public shakeEx() {
		frame.setTitle("�����ϴ� ������ �����");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(100, 100);
		frame.add(p);
		
		Shake th = new Shake(frame);  //������ ����
		
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		th.start();  //������ ����
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
				f.setLocation(150, 155);  //�������� ����Ʈ�� ���� ������ ���� ����
				Thread.sleep(1);   //1�� ���� ���� �ܴ�.
				f.setLocation(155, 150);  //�������� ����Ʈ�� ���� ������ ���� ����
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}
