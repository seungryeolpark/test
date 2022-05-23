package ch09;

public class Manager extends Employee {
	private int bonus;
	
	public Manager(String name, String address, int salary, String rrn,
			int bonus) {
		super(name, address, salary, rrn);
		this.bonus = bonus;
	}
	// 기본생성자를 명시적으로 코딩
	public Manager() {}
	
	void test() {
		System.out.println("name="+name);
		System.out.println("address="+address);
		// private String rrn 했기에 상속이 안되어 getter 로 값을 가져옴
		System.out.println("주민번호 : "+getRrn());
		System.out.println("salary="+salary);
		System.out.println("bonus="+bonus);
	}

}
