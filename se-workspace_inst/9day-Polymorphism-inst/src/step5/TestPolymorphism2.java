package step5;
class Zoo{
	/* �̿� ���� ��ü�� ������ ���� ������ ��� 
	 * �̿� �����ϴ� ó�� �޼���� ��� �����Ǿ�� �Ѵ� 
	 * �ý����� ���յ��� ���� ������������ ���� �ʴ� 
	 * public void pass(Person p) { p.eat(); } 
	 * public void pass(Monkey monkey) {
	 * monkey.eat(); }
	 */
	// �Ʒ��� ���� �������� ����� �Ű������� ó���ϸ�
	// Animal �ڽ� ��ü�� �������� ������� �ϳ��� 
	// �޼���(�޼��� ���)���� ��� ó���� �� �ִ�. 
	public void pass(Animal a) {
		a.eat();
	}
}
public class TestPolymorphism2 {
	public static void main(String[] args) {
		Zoo zoo=new Zoo();
		zoo.pass(new Person());
		zoo.pass(new Monkey());
		// �� �� �������� �پ��� ������ ��ü�� �ִٰ� ���� 
	}
}







