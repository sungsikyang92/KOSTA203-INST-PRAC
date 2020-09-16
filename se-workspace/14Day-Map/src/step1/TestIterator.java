package step1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * 	Iterator interface: �ݺ� ���� ǥ�� �������̽�
 */
public class TestIterator {
	public static void main(String[]args) {
		Collection<String> c1=new ArrayList<String>();
		c1.add("���̽�");
		c1.add("ó��ó��");
		Iterator<String> it=c1.iterator();
		while(it.hasNext()) {//hasNext(): ������Ұ� �����ϸ� true
			System.out.println(it.next());
		}
		System.out.println("**************************");
		Collection<String> c2=new LinkedHashSet<String>();
		c2.add("ī��");
		c2.add("�׶�");
		//c2�� �ִ� ��ҵ��� Iterator ������� �ݺ� �����غ���.
		Iterator<String> it2=c2.iterator();
			while(it2.hasNext()) {
				System.out.println(it2.next());
				//���� ���� Set �迭 ����ü(LinkedHasSet)�̵�
				//�ƴϸ� List�迭 ����ü�̵� �������
				//Collection Interface�� �����̹Ƿ�
				//���� ���(Interator interface)���� �ݺ� ���� ����
			}
	}

}
