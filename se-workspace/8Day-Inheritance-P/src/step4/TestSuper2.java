package step4;

class GrandParent{
	public GrandParent() {
		System.out.println("���θ� ��ü ����");
	}
}
class Parent extends GrandParent{
	public Parent() {
		System.out.println("�θ� ��ü ����");
	}
}
class Child extends Parent{
	public Child() {
		System.out.println("�ڽ� ��ü ����");
	}
}

public class TestSuper2 {
	public static void main(String[] args) {
		new Child();
	}
}
