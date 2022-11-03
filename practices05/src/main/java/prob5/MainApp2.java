package prob5;

public class MainApp2 {

	public static void main(String[] args) {
		try {
			MyStack02 stack = new MyStack02(3);
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");
			//stack.push(12);

			while (stack.isEmpty() == false) {
				// 위험하다: 잘못된 Type Casting할 우려가 있다.
				// 1. 작성시 에러가 발견되지 않음
				// 2. 런타임 때 ClassCastingException이 발생할 우려가 있따.
				String s = (String)stack.pop();
				System.out.println(s);
			}

			System.out.println("======================================");

			stack = new MyStack02(3);
			stack.push("Hello");

			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
		} catch (MyStackException ex) {
			System.out.println( ex );
		}

	}

}
