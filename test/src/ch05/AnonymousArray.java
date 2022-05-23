package ch05;

public class AnonymousArray {
	public static void main(String[] args) {
		System.out.println("숫자들의 합 : "+sum(new int[] {1, 2, 3, 4}));
		// 무명배열 : 참조변수의 이름 없는 배열 => 단순히 초기값만으로 배열을 생성
		// 무명배열은 즉시 배열을 만들어 함수의 인수로 전달할 때 쓰이고
		// 배열이 딱 한번만 필요하고 다시 참조할일이 없을 때 사용할 수 있음.
	}
	
	public static int sum(int[] nums) {
		int total = 0;
		for (int i=0; i<nums.length; i++) {
			total += nums[i];
		}
		return total;
	}
}
