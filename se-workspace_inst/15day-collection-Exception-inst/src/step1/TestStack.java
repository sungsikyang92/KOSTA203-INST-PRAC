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
		System.out.println(stack.peek());//�������� ��ȯ 
		System.out.println("**********");
		/*
		 * System.out.println(stack.pop());//����, stack���� ����
		 * System.out.println(stack.pop()); System.out.println(stack.pop());
		 * System.out.println(stack.pop());
		 */
		//��� ������ true , ��Ұ� ������ false 
		System.out.println(stack.empty());
		// �� empty() �̿��ؼ� ��� ��Ҹ� �����غ��� 
		while(stack.empty()==false) // !stack.empty()
			System.out.println(stack.pop());
		System.out.println(stack);
	}
}












