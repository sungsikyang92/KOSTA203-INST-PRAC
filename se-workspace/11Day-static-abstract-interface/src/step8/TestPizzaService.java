package step8;

import step6.PizzaService;
import step7.PotatoPizzaService;
import step7.SeaFoodPIzzaService;

public class TestPizzaService {
	public static void main(String[] args) {
		//포테이토 피자를 만들기 위해 메서드를 호출해본다
		PotatoPizzaService s1=new PotatoPizzaService();
		s1.makePizza();
		System.out.println("**********************************");
		//step7에 SeaFoodPizzaService를 구현해본다.
		SeaFoodPIzzaService s2=new SeaFoodPIzzaService();
		s2.makePizza();
		//다형성 적용 - 부모 타입으로 자식 객체를 참조
		System.out.println("**********************************");
		PizzaService p=new PotatoPizzaService();
		p.makePizza();
		System.out.println("감자피자");
		PizzaService[]array= {
				new PotatoPizzaService(),new SeaFoodPIzzaService()
		};
		for(int i=0;i<array.length;i++) {
			array[i].makePizza();
		}
	}
}
