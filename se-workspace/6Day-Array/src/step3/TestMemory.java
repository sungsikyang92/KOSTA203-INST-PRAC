package step3;
class Person{
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
class Exam{
	public void test1(Person p) {
		p=new Person("�����");
	}
	public void test2(Person p) {
		p.setName("������");
	}
}
public class TestMemory {
	public static void main(String[] args) {
		Person p=new Person("�˼���");
		Exam e=new Exam();
		e.test1(p);
		System.out.println(p.getName());
		e.test2(p);
		System.out.println(p.getName());
	}
}
