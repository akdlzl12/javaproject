package sample7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventNotification {
	
	private Map<String, EventSender> map;
	
	private List<User> userList;
	
	public EventNotification(Map<String, EventSender> map) {
		this.map = map;
	}
	
	public void sendNotic(String message, User user) {
		EventSender sender = map.get(user.getTypes());
		sender.sendEvent(message, user);
	}
}
