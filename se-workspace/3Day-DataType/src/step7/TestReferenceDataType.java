package step7;

public class TestReferenceDataType {
	public static void main(String[] args) {
		/*
		 * Person: ������ ������ Ÿ��
		 * p: �������� reference variable(��ü�� �����ϴ� �ּҰ��� ����)
		 * =: �Ҵ� �Ǵ� ����
		 * new: �ڹ� Ű����(��ü ������ ����)
		 * Person("������"): ������ constructor
		 */
		Person p=new Person("������");
		System.out.println(p.getName());
		Person p2=new Person("�ں���");
		System.out.println(p2.getName());
		p=p2;//p2 �ּҰ��� p�� �Ҵ��Ѵ�
		System.out.println(p.getName());
		System.out.println(p2.getName());
	}
}
