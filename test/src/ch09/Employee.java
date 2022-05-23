package ch09;

public class Employee {
	// 맴버변수
	public String name;
	String address;
	protected int salary;
	private String rrn;
	// 생성자
	public Employee() {}

	public Employee(String name, String address, int salary, String rrn) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.rrn = rrn;
	}
	// 메소드
	public String getRrn() {
		return rrn;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
}
