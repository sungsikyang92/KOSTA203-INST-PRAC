package step6;
/*
 *  ��ü ���� ���� 
 *  association > aggregation 
 *  use a			has a 
 */
public class TestAggregation {
	public static void main(String[] args) {
		// ����� ����Ʈ ���� ������ ����Ѵ� 
		// �ʿ� Ŭ������? Person  , SmartPhone 
		// �Ʒ� �ڵ带 ���� �˸´� Person class �� �����Ѵ� 
		Person p=new Person("�̵���");
		System.out.println(p.getName());//�̵���
		p.setSmartPhone(new SmartPhone("��9",100));
		System.out.println(p.getSmartPhone().getModel());//��9
		// �̵������ �� ������ ����غ��� 
		System.out.println(p.getSmartPhone().getPrice());
		// �̵������ �� �𵨸��� ��20 ���� �����غ��� 
		p.getSmartPhone().setModel("��20");
		System.out.println(p.getSmartPhone().getModel());//��20
	}
}
















