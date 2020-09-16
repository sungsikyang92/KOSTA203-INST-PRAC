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
		//배열처럼 순번으로 정보를 관리 
		//ArrayList list=new ArrayList();
		//list.add(new Car("소나타"));
		//첫번째 요소를 반환받아 getName()을 호출해 출력한다 
		//Object type으로 반환되므로 객체 캐스팅이 필요 
		//Car car=(Car)list.get(0);
		//System.out.println(car.getName());
		// jdk 1.6 버전 이상에서는 Generic이 추가되어 
		// 객체 캐스팅 절차를 감소하고 타입의 안정성을 도모하도록 한다 
		// 아래와 같이 Generic 을 명시하기를 권장한다 
		ArrayList<Car> list2=new ArrayList<Car>();
		list2.add(new Car("소나타"));
		System.out.println(list2.get(0).getName());
	}
}









