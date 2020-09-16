package step3;
// Exception 관련 keyword 전체를 이용해 프로그램을 작성하고 
// 실행결과를 예상해보는 예제 
class DayException extends Exception{
	DayException(String message){
		super(message);
	}
}
class DateService{
	public void register(int day) throws DayException {
		try {
		if(day<1||day>31)
			throw new DayException("k");
		System.out.println("b");
		}finally {
			System.out.println("a");
		}
	}//method
}//class

public class TestThrows4 {
	public static void main(String[] args) {
		DateService service=new DateService();
		int day=0;
		//day=1;
		try {
			service.register(day);
			System.out.println("c");
		} catch (DayException e) {
			System.out.println(e.getMessage());
		}
	}
}










