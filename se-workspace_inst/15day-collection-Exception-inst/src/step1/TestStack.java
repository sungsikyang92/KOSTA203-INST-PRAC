package step1;

import java.util.Stack;

// Stack : LIFO (Last in First out)
public class TestStack {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("a"); 
		stack.push("b");
		stack.push("c");
		System.out.println(stack);
		System.out.println(stack.peek());//삭제없이 반환 
		System.out.println("**********");
		/*
		 * System.out.println(stack.pop());//추출, stack에서 삭제
		 * System.out.println(stack.pop()); System.out.println(stack.pop());
		 * System.out.println(stack.pop());
		 */
		//비어 있으면 true , 요소가 있으면 false 
		System.out.println(stack.empty());
		// 위 empty() 이용해서 모든 요소를 추출해본다 
		while(stack.empty()==false) // !stack.empty()
			System.out.println(stack.pop());
		System.out.println(stack);
	}
}












