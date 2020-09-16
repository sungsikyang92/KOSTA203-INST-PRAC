package step2;
/*
 *  객체 생성 초기화 단계를 공부하는 예제 
 */
public class TestObjectInit {
	public static void main(String[] args) {
		/* Car : 클래스명이자 참조형 데이터 타입 
		 * car : 변수 ( 지역변수 , 참조변수 ) 
		 * = : 할당 또는 대입 
		 * new : 자바 예약어 
		 * Car() : 생성자 Constructor 
		 */
		Car car=new Car();
		// flag 는 인스턴스 변수이므로 기본 초기화되어
		// false 가 반환된다 
		System.out.println(car.isFlag());
		// price 는 실수형이므로 기본 초기화 0.0 
		System.out.println(car.getPrice());
		// model 은 참조형이므로 기본 초기화 null 
		System.out.println(car.getModel());
	}
}









