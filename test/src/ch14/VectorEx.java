package ch14;

import java.util.Vector;

// 컬렉션(Collections) - 배열의 단점(같은 데이터만)을 보완한 클래스들
// Map계열 - 순서는 제공되지 않지만 기기 제공됨(인덱스가 없고 키로 조회)
// List계열 - 순서대로 저장, 키가 없음(인덱스로 조회)
// Vector대신 요즘은 ArrayList를 많이 쓴다.

public class VectorEx {
	public static void main(String[] args) {
		Vector<Object> v = new Vector<>();
		
		System.out.println("초기사이즈 : "+v.capacity());
		// 벡터는 기본적으로 10개의 사이즈를 만들어 놓는다.
		// 사이즈가 넘어가면 자동적으로 10개씩 늘린다.
		v.add("first");
		v.add(2);
		v.add(3.5);
		v.add(true);
		v.add(100);
		v.add(101);
		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106);
		v.add(107);
		
		System.out.println("중간사이즈 : "+v.capacity());
		System.out.println("데이터의 갯수 : "+v.size());
		// 배열의 length와 같은 역할인 size()
		
		System.out.println("초기 데이터");
		for (int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		v.add(6, 102);
		for (int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+" ");
		}
	}

}
