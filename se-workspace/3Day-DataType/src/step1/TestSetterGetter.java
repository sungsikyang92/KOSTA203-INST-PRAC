package step1;
/*
 * Encapsulation ����� Ŭ������ �׽�Ʈ �ϴ� ����
 * setter / getter�� Ȱ���غ���.
 */
public class TestSetterGetter {
	public static void main(String[] args) {// main ctrl+space�� ������
		//Person ��ü ����, ���������� p�� �Ѵ�.
		Person p=new Person();
		//p��ü�� name�� �������� �Ҵ��غ���.
		//p.name="������";//private �̹Ƿ� ���� �Ұ�.
		//name�� �Ҵ��ϱ� ���� setter�� setName �޼��带 �̿��Ѵ�.
		p.setName("������");
		/*
		 * �Ҵ��� name�� ��ȯ�޾Ƽ� ����غ���.
		 * �ּ�ó�� ����Ű ctrl + shift + /
		 * �ּ�ó�� ���� ����Ű ctrl + shift + \
		 * String name=p.getName();
		 * System.out.println(name);
		 */
		//�� �� ������ �Ѷ������� ǥ���ϸ� �Ʒ��� ����.
		System.out.println(p.getName());
		System.out.println("************************************");
		//�Ʒ� �ڵ忡 �����Ǵ� Person class�� ��Ҹ� �ڵ�
		//1. �ν��Ͻ� ���� 2. setter 3. getter
		//p.age=-11; private�̹Ƿ� ���ٺҰ�
		//�߸��� ������ ��쿡�� �Ҵ����� �ʵ���
		//Person class�� setAge()�� �����غ���.
		p.setAge(1);
		System.out.println(p.getAge()+"��");
	}
}
