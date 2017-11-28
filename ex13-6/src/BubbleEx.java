import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BubbleEx extends JFrame{
	public BubbleEx() {
		setTitle("버블 게임");
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
			ImageIcon img = new ImageIcon("C:\\Users\\김주영\\Desktop\\a.jpg");  //이미지 삽입
			bubble = new JLabel(img);
			bubble.setSize(img.getIconWidth(),img.getIconWidth());  //이미지 크키만큼
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
					sleep(200);  //0.02동안 잠을잔다.
				}
				catch(InterruptedException e) {}
			}
		}
	}
}
