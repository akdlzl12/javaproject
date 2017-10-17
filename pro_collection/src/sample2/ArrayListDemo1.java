package sample2;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(new Book("10", "오직 두 사람", "김영하", "문학동네", 11700));
		bookList.add(new Book("11", "해리포터1", "버르버르", "문학창작", 12700));
		bookList.add(new Book("12", "해리포터2", "바르바르", "동네문화", 12700));
		bookList.add(new Book("13", "해리포터3", "웨르뤠르", "우리문화", 12700));
		bookList.add(new Book("14", "나의 라임 오렌지나무", "루니", "스카이스포츠", 21700));
		
//		int totalOrderPrice = 0;
//		for (Book book : bookList) {
//			totalOrderPrice +=book.getPrice();
//		}
//		System.out.println(totalOrderPrice + " 원");
//		System.out.println(bookList);
		
		Book book = new Book("10", "해리포터1", "버르버르", "문학창장", 12700);
		boolean exist = bookList.contains(book);
		System.out.println(exist);
		
		
	}
}
