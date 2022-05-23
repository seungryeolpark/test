package ch15;

public class ExceptionExam {
	// 에러 Error - 컴파일 오류
	// 경고 Warning - 에러는 아니지만 잠재적인 문제를 발생시킬수 있는 코드
	// 예외 Exception - 실행하면서 오류가 발생하는 경우
	public static void main(String[] args) {
		int a = 10, b = 0, c;
		try {
			// 분모에 0이 있는 산출연산
			c = a/b; 
			System.out.println(c);
			// 잘 모를땐 Exception만 해도 된다.
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
