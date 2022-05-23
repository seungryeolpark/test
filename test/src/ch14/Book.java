package ch14;

import java.util.Scanner;

public class Book {
	private String bookName;
	private String press;
	private int price;
	private int amount;
	// 판매금액(단가x수량)
	private int money;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("도서명 : ");
		bookName = sc.next();
		System.out.print("출판사 : ");
		press = sc.next();
		System.out.print("단가 : ");
		price = sc.nextInt();
		System.out.print("수량 : ");
		amount = sc.nextInt();
		
		money = price*amount;
	}
	
	// getter, setter
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	

}
