package step8;

import step6.PizzaService;
import step7.PotatoPizzaService;
import step7.SeaFoodPizzaService;

public class TestPizzaService {
	public static void main(String[] args) {
		// �������� ���ڸ� ����� ���� �޼��带 ȣ���غ��� 
		PotatoPizzaService s1=new PotatoPizzaService();
		s1.makePizza();
		System.out.println("*************************");
		//step7 �� SeaFoodPizzaService�� �����غ��� 
		SeaFoodPizzaService s2=new SeaFoodPizzaService();
		s2.makePizza();
		System.out.println("*************************");
		// ������ ���� - �θ� Ÿ������ �ڽ� ��ü�� ���� 
		PizzaService p=new PotatoPizzaService();
		p.makePizza();
		System.out.println("*************************");
		PizzaService [] array=
			{new PotatoPizzaService(),new SeaFoodPizzaService()};
		for(int i=0;i<array.length;i++) {
			array[i].makePizza();
		}
	}
}















