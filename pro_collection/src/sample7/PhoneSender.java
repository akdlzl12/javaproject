package sample7;

public class PhoneSender implements EventSender {
	public void sendEvent(String message, User user) {
		
		System.out.println("[전화안내] 수신자: " + user.getName() + ", 내용: " + message);
		
	}
}
