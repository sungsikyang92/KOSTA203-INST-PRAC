package step7;

import step6.PizzaService;

public class PotatoPizzaService extends PizzaService{

	@Override
	protected void topping() {
		System.out.println("감자 토핑을 올리다");
	}
	
}
