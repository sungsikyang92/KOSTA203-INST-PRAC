package step1;

import java.util.LinkedList;
import java.util.Queue;

// FIFO  
public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		queue.add("���ƾ� �氡�氡");
		queue.add("����?");
		queue.add("������!!!!");
		queue.add("�����~~~");
		//�������� ������ȯ, ���� ���� �� ������ ���´� 
		//System.out.println(queue.peek());
		//System.out.println(queue.poll());//����(����)
		//System.out.println(queue);
		//System.out.println(queue.isEmpty());
		//  while �� �̿��ؼ� ������ ���������� �����غ��� 
		while(queue.isEmpty()==false)
			System.out.println(queue.poll());
		System.out.println(queue);
	}
}
















