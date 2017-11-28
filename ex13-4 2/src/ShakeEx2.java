import javax.swing.*;
import java.awt.*;

public class ShakeEx2 extends JFrame{
	public ShakeEx2() {
		setTitle("�����ϴ� ���̺� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("�������̺�");
		label.setLocation(150,150);
		label.setSize(100,100);
		c.add(label);
		
		Shake2 th = new Shake2(label);  //������ ����
		
		setSize(350,350);
		setVisible(true);
		
		th.start();  //������ ����
	}
	public static void main(String[] args) {
		new ShakeEx2();
	}
	class Shake2 extends Thread {
		private JLabel label;  //���ڰ� ���� ���̺� ����
		public Shake2(JLabel label) {
			this.label = label;
		}
		public void run() {
			while(true) {
				label.setLocation(150,155);
				label.setLocation(155, 150);  //������ ���ü� �ְ� ��ġ�� ���ݾ� ����
			}
		}
	}
}
