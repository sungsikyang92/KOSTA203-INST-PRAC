package step8;

import step6.PizzaService;
import step7.PotatoPizzaService;
import step7.SeaFoodPIzzaService;

public class TestPizzaService {
	public static void main(String[] args) {
		//�������� ���ڸ� ����� ���� �޼��带 ȣ���غ���
		PotatoPizzaService s1=new PotatoPizzaService();
		s1.makePizza();
		System.out.println("**********************************");
		//step7�� SeaFoodPizzaService�� �����غ���.
		SeaFoodPIzzaService s2=new SeaFoodPIzzaService();
		s2.makePizza();
		//������ ���� - �θ� Ÿ������ �ڽ� ��ü�� ����
		System.out.println("**********************************");
		PizzaService p=new PotatoPizzaService();
		p.makePizza();
		System.out.println("��������");
		PizzaService[]array= {
				new PotatoPizzaService(),new SeaFoodPIzzaService()
		};
		for(int i=0;i<array.length;i++) {
			array[i].makePizza();
		}
	}
}
