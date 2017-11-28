import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BubbleEx extends JFrame{
	public BubbleEx() {
		setTitle("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Bubble b = new Bubble();
		setContentPane(b);
		setSize(400,400);	
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new BubbleEx();
	}
}
class Bubble extends JPanel {
	public Bubble() {
		setLayout(null);
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				BubbleThread bubbleThread = new BubbleThread(e.getX(), e.getY());
				bubbleThread.start();
			}
		});
	}
	
	class BubbleThread extends Thread {
		JLabel bubble;
		public BubbleThread(int bubbleX, int bubbleY) {
			ImageIcon img = new ImageIcon("C:\\Users\\���ֿ�\\Desktop\\a.jpg");  //�̹��� ����
			bubble = new JLabel(img);
			bubble.setSize(img.getIconWidth(),img.getIconWidth());  //�̹��� ũŰ��ŭ
			bubble.setLocation(bubbleX, bubbleY);
			add(bubble);
			repaint();
		}
		
		public void run() {
			while(true) {
				int x = bubble.getX() ;
				int y = bubble.getY() - 5;
				if(y < 0) {
					remove(bubble);
					repaint();
					return;
				}
				bubble.setLocation(x, y);
				repaint();
				try {
					sleep(200);  //0.02���� �����ܴ�.
				}
				catch(InterruptedException e) {}
			}
		}
	}
}
