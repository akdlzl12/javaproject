package example4;

public class AuthApp {
	public static void main(String[] args) {
		Auth<String, String> auto1 = new Auth<String, String>("hong", "zxcv1234");
		
		Auth<String, Integer> auth2 = new Auth<String, Integer>("kim", 1234);
	}
}
