package sample7;

import java.util.HashMap;
import java.util.Map;

public class NotificationApp {
	public static void main(String[] args) {
		Map<String, EventSender> map = new HashMap<>();
		map.put("M", new EmailSender());
		map.put("P", new PhoneSender());
		
		EventNotification notic = new EventNotification(map);
		
		notic.sendNotic("장마철 대비 상품 할인!!", new User("홍길동", "P"));
		notic.sendNotic("장마철 대비 상품 할인!!", new User("이순신", "M"));
	}
}
