package pro_thread;

public class FilebackApp {
	public static void main(String[] args) {
		Thread t1 = new FileBackupThread("b111.backup");
		Thread t2 = new FileBackupThread("b222.backup");
		Thread t3 = new FileBackupThread("b333.backup");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
