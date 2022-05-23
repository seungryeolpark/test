package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListBook {
	public static void main(String[] args) {
		List<Book> list = new ArrayList<>();
		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		System.out.println("3건의 도서 자료를 입력하세요");
		b1.input();
		b2.input();
		b3.input();
		
		// list에 Book instance 추가
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		System.out.println("도서명\t출판사\t단가\t수량\t금액");
		for (int i=0; i<list.size(); i++) {
			Book b = list.get(i);
			System.out.println(b.getBookName()+"\t"+b.getPress()+"\t"
					+b.getPrice()+"\t"+b.getAmount()+"\t"+b.getMoney());
		}
		
	}
}
