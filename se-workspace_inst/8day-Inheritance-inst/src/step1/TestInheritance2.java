package step1;
class Animal{
	private int age=1;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
// Person(sub class) �� Animal(super class)�� ��ӹ޴´� 
// extends : Ȯ���ϴ�
class Person extends Animal{
	public void study() {
		System.out.println(getAge()+"���� �����ϴ�");
	}
}
public class TestInheritance2 {
	public static void main(String[] args) {
		Person p=new Person(); // �ڽ� ��ü�� ���� 
		// compile error : ������ 
		// age ������ private ���� �����ڷ� ����Ǿ��ְ�
		// private�� �ڽ��� Ŭ���� �������� ���� ���� 
		// ��ӹ޾Ҿ Ŭ������ �ٸ��Ƿ� ���� ���� �Ұ� 
		//System.out.println(p.age);
		// �θ��� private ������ setter/getter �� ����
		// �����ϸ� �ȴ� 
		System.out.println(p.getAge());
		p.study();
	}
}




