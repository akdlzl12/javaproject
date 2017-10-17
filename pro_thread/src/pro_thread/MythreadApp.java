package pro_thread;

public class MythreadApp {
	public static void main(String[] args) throws InterruptedException {
		
		// 새로운 스레드 생성하기
		Thread t = new MyThread();
		// 새로운 스래드 시장하기
		t.start();
		
		for(int a = 0; a < 100; a++) {
			System.out.println("메인스레드: " + a);
			Thread.sleep(300);		// 0.3초동안 메인스레드를 재운다.
		}
	}
}
