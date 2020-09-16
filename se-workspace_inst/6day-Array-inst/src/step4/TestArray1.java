package step4;

public class TestArray1 {
	public static void main(String[] args) {
		int age [] ;  // 배열 선언 , int [] age 
		age = new int[3]; // 배열 객체 생성 
		age[0] = 10; // 배열 첫번째 방에 10을 저장 
		System.out.println(age[0]);//배열은 0부터 인덱스가 시작됨
		System.out.println(age[1]);//기본 초기화 0 
		System.out.println(age[2]);
		age[1]=14;
		age[2]=20;
		System.out.println(age.length);//배열 방 길이 
		System.out.println("***age 배열 요소를 모두 출력***");
		//for 문 이용 -> 많이 쓰니까 꼭 익혀두자!!
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
	}
}








