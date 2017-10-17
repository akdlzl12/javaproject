package example1;

public class ObjectDemo5 {
	public static void main(String[] args) {
		Score src = new Score("홀길동", 70, 40, 100);
		Score clone = src.cloneScore();
		
		System.out.println("원본: " + src);
		System.out.println("복사본: " + clone);
		
		// 복제본의 값 변경
		clone.setKor(100);
		
		System.out.println("원본: " + src);
		System.out.println("복사본: " + clone);
	}

}
