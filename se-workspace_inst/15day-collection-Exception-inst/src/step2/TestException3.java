package step2;

import java.util.ArrayList;

public class TestException3 {
	public static void main(String[] args) {
		//Exception 발생하면 프로그램이 실행 중단한다 
		//Exception이 발생하면 JVM은 예외 정보 전달 후 비정상종료
		//Exception 주요 키워드인 try catch를 이용해 
		//예외 처리를 하고 프로그램을 정상실행하도록 해본다 
		// 하나의 try 블럭 안에 다양한 예외가 발생하지 있으므로 
		// 여러개의 catch 구문이 가능하다 
		// 단 자식클래스에서 부모순으로 정의해야 한다 
		// Exception은 최대한 구체적으로 catch하는 것이 좋다 
		/*		
		 *  출금작업단위(트랜잭션)
		 *  try{
		 *   1. 카드 삽입() -> 카드Exception
		 *   2. 작업선택
		 *   3. 금액입력 -> 잔액부족Exception
		 *   4. 출금
		 *   }catch(카드Exception){
		 *   }catch(잔액부족Exception){
		 *   }catch(Exception){}
		 */
		ArrayList<String> list=new ArrayList<String>();
		String name="정준상";
		name=null;
		try { // try는 예외발생예상지점 
			System.out.println(list.get(1));
			System.out.println(name.length());
			
		}catch(NullPointerException ne) {//catch 예외발생시 대안흐름 실행 
			System.out.println("대안작업실행");
		}catch(Exception e) {
			System.out.println("대안작업실행2");
		}
		System.out.println("프로그램 정상 수행");
	}
}








