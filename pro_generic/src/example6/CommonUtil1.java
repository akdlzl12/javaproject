package example6;

public class CommonUtil1 {
	public static <K,V>boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		
		boolean result1 = p1.getKey().equals(p2.getKey());
		boolean result2 = p1.getValue().equals(p2.getValue());
		return result1 && result2;
	}
}
