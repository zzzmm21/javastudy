package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> s =  new HashSet<>();
		
		String s1 = new String("도우너");
		String s2 = new String("도우너");
		
		s.add("둘리");
		s.add("마이콜");
		s.add("도우너");
		s.add("또치");
		s.add(s1);
		System.out.println(s.size());			// 사이즈 값이 같으면 추가안됨
		System.out.println(s.contains("둘리"));  // contains 찾기
		
		//순회
		for(String str : s) {
			System.out.println(str);
		}
	}

}
