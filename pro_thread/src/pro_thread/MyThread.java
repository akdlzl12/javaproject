package pro_thread;

public class MyThread extends Thread {
	
	// 새로운 스레드를 생성해서 실행할 코드를 작성한다.
	@Override
	public void run() {
		for(int a = 0; a < 100; a++) {
			System.out.println("My스레드: " + a);
			try {
				Thread.sleep(100);		// 0.3초동안 메인스레드를 재운다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}

}
