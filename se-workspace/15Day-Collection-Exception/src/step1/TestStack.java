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
		//���� �ֱٿ� �������� ��ȯ��
		System.out.println(stack.peek());
		System.out.println("**********");
		//��ȯ �� �����Ͽ� stack���� ����
		System.out.println(stack.pop());
		System.out.println(stack);
		//��� ������ true, ��Ұ� ������ false
		System.out.println(stack.isEmpty());
		//isEmpty()�� �̿��ؼ� ��� ��Ҹ� �����غ���.
		while(stack.isEmpty()==false)//or !stack.isEmpty()
			System.out.println(stack.pop());
		System.out.println(stack);
	}
}
