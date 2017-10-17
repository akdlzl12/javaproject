package sample6;

import java.util.Vector;

public class VectorDemo2 {
	public static void main(String[] args) {
		Runnable r = new MyRunnable() {
			
			Thread t1 = new Thread(r);
			Thread t2 = new Thread(r);

			
		};
	}
	
	// collection에 숫자를 저장하는 스레드
	public static class MyRunnable implements Runnable {
		Vector<Integer> numbers = new Vector<>();
		
		public void run() {
			for(int i = 0; i < 100; i++) {
				numbers.addElement(i);
				
			}
		}
	}
}
