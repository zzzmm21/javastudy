package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String , Integer> m = new HashMap<>();
		
		String ks1 = "one"; // 앞에 key 값은 불변 봐뀌면 안된다.
		m.put(ks1, 1); // autoBoxing
		m.put("two", 2);
		m.put("three", 3);
		
		int i = m.get("one"); // auto unboxing
		int j = m.get(new String("two"));
		System.out.println(i +  ":" + j);
		
		m.put("three", 33333);
		System.out.println(m.get("three"));
		
		//  순회
		Set<String> s= m.keySet();
		for(String key : s) {
			System.out.println(m.get(key));
		}
		
	}

}
