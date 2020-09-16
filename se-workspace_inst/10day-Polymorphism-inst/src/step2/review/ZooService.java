package step2.review;

public class ZooService {
	public void execute(Animal a) { //부모타입의 매개변수로 처리하면 자식들 모두 처리!
		// Person 객체인지 확인 
		if(a instanceof Person) { // Person 객체이면 
			// ticketing() 을 호출 -> 자식의 독자적 메서드 -> Object down casting
			((Person) a).ticketing();
		}
		a.play();//오버라이딩된 자식 메서드가 각각 실행됨 
	}
}
