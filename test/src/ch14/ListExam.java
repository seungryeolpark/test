package ch14;

import java.util.ArrayList;
import java.util.List;

// ArrayList : Vector의 사용법이 비슷하지만 좀 더 가볍고 속도가 빠름

public class ListExam {
	public static void main(String[] args) {
		// ArrayList<Object> list = new ArrayList<>();
		// 실무에서는 위와는 달리 좌변:부모, 우변:자식의 다형성 형태로 처리한다.
		List<Object> list = new ArrayList<>();
		
		list.add("하나");
		list.add(2);
		list.add(5.5);
		list.add(false);
	}

}
