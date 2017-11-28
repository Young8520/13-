import java.util.Scanner;

public class ThreadEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아무키나 입력>>");
		scanner.nextLine();    
		scanner.close();
		Thread th = new Thread(new ThreadExs());  //스레드 객체 만듬
		th.start();
	}
}
class ThreadExs implements Runnable {
	//스레드 코드. run()이 종료하면 스레드 종료
	public void run() {  
		System.out.println("스레드 실행 시작");
		for(int i = 1; i <=10; i++)
			System.out.print(i + " ");
		System.out.println();  //한줄띄움
		System.out.println("스레드 종료");
	}
}
