package step1;

import java.util.Stack;

//Stack: LIFO(Last In First Out)
public class TestStack {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("a");
		stack.push("a");
		stack.push("c");
		System.out.println(stack);
		//가장 최근에 넣은것을 반환함
		System.out.println(stack.peek());
		System.out.println("**********");
		//반환 후 추출하여 stack에서 삭제
		System.out.println(stack.pop());
		System.out.println(stack);
		//비어 있으면 true, 요소가 있으면 false
		System.out.println(stack.isEmpty());
		//isEmpty()를 이용해서 모든 요소를 추출해본다.
		while(stack.isEmpty()==false)//or !stack.isEmpty()
			System.out.println(stack.pop());
		System.out.println(stack);
	}
}
