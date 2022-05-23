package ch14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		// Set은 중복값을 허용하지 않음, 순서없음
		hs.add("Korea");
		hs.add("japan");
		hs.add("america");
		hs.add("britain");
		hs.add("Korea");
		System.out.println(hs);
		for (String str : hs) {
			System.out.println(str);
		}
		
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
