package sample6;

import java.util.LinkedList;

public class QueueDemo {
	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<>();
		
		queue.offer("홍길동");
		queue.offer("김유신");
		queue.offer("강감찬");
		queue.offer("이순신");
		
		System.out.println("큐에 저장된 요쇼의 갯수: " + queue.size());
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println("큐에 저장된 요소의 갯수: " + queue.size());
	}
}
