package step1;
/*
 * Encapsulation적용 클래스
 * 외부에 공개하지 않을 부분은 private 접근제어자를 명시
 * 외부에 공개하여 소통할 부분은 public 접근제어자를 명시
 */
public class Person {
	private String name;//private이므로 name에 접근불가하게 만듬
	//setter는 외부에서 정보를 할당받기 위한 메서드
	public void setName(String name) {
		//this 예약어(keyword)는 인스턴스 변수를 가르키기 위하여 사용한다.
		//this를 이용해 인스턴스변수와 매개변수를 구분한다.
		this.name=name;
	}
	//getter 외부에서 정보를 반환받기 위한 메서드
	public String getName() {
		return name;
	}
	/*
	 * 매개변수 age의 전달된 값이 1 미만일 경우
	 * 잘못된 나이이므로 할당할 수 없습니다.
	 * 1 이상이면 객체의 인스턴스 변수 age에 할당한다.
	 */
	private int age=1;
	public void setAge(int age) {
		if(age>1) {
			this.age=age;
		}else {
			System.out.println("잘못된 나이이므로 할당할 수 없습니다.");
		}
	}
	public int getAge() {
		return age;
	}
}
