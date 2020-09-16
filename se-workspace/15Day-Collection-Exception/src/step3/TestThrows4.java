package step3;
/*Exception관련 keyword전체를 이용해 프로그램을 작성하고
 * 실행결과를 예상해보는 예제
 */
class DayException extends Exception{
	public DayException(String message) {
		super(message);
	}
}
class DateService{
	public void register(int day) throws DayException{
		try {
			if(day<1||day>31)
				throw new DayException("k");
			System.out.println("b");
		}finally {
			System.out.println("a");
		}
	}
}
public class TestThrows4 {
	public static void main(String[] args) {
		DateService service=new DateService();
		int day=0;
		day=0;
		try {
			service.register(day);
			System.out.println("c");
		}catch(DayException e) {
			System.out.println(e.getMessage());
		}
	}
}
