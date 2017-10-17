package example1;

public class ObjectDemo4 {

	public static void main(String[] args) {
		Score src = new Score("홀길동", 70, 40, 100);
		Score copy = src;
		
		System.out.println("원본: " + src);
		
		// 복사본의 값을 변경
		copy.setKor(90);
		
		System.out.println("원본: " + src);
		System.out.println("복사본: " + copy);

	}

}
