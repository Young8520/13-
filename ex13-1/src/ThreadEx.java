import java.util.Scanner;

public class ThreadEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ƹ�Ű�� �Է�>>");
		scanner.nextLine();    
		scanner.close();
		Thread th = new Thread(new ThreadExs());  //������ ��ü ����
		th.start();
	}
}
class ThreadExs implements Runnable {
	//������ �ڵ�. run()�� �����ϸ� ������ ����
	public void run() {  
		System.out.println("������ ���� ����");
		for(int i = 1; i <=10; i++)
			System.out.print(i + " ");
		System.out.println();  //���ٶ��
		System.out.println("������ ����");
	}
}
