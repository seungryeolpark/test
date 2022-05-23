package ch13;

public class Type1 {
	private double value;
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		Type1 t = new Type1();
//		t.setValue(100);
		t.setValue(100.5);
		System.out.println(t.getValue());
	}
}
