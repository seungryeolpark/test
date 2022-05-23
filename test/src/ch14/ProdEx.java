package ch14;

public class ProdEx {
	// 제품명
	private String name;
	// 제품코드
	private String num;
	// 제조사
	private String company;
	private int price;
	private int amount;
	private int money;
	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
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
		return price*amount;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	// constructor
	public ProdEx(String name, String num, String company, int price, int amount) {
		this.name = name;
		this.num = num;
		this.company = company;
		this.price = price;
		this.amount = amount;
	}
	public ProdEx() {
	}
	

}
