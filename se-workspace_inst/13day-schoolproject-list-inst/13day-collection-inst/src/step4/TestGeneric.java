package step4;

import java.util.ArrayList;
class Car{
	String name;
	Car(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
public class TestGeneric {
	public static void main(String[] args) {
		//�迭ó�� �������� ������ ���� 
		//ArrayList list=new ArrayList();
		//list.add(new Car("�ҳ�Ÿ"));
		//ù��° ��Ҹ� ��ȯ�޾� getName()�� ȣ���� ����Ѵ� 
		//Object type���� ��ȯ�ǹǷ� ��ü ĳ������ �ʿ� 
		//Car car=(Car)list.get(0);
		//System.out.println(car.getName());
		// jdk 1.6 ���� �̻󿡼��� Generic�� �߰��Ǿ� 
		// ��ü ĳ���� ������ �����ϰ� Ÿ���� �������� �����ϵ��� �Ѵ� 
		// �Ʒ��� ���� Generic �� ����ϱ⸦ �����Ѵ� 
		ArrayList<Car> list2=new ArrayList<Car>();
		list2.add(new Car("�ҳ�Ÿ"));
		System.out.println(list2.get(0).getName());
	}
}









