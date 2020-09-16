package step1;
/*
 *   AND 와 OR 연산 
 *   
 *   AND 연산 -> 모두 true 일 경우에만 true
 *   OR 연산 -> 모두 false 일 경우에만 false 
 *   
 *   and 연산 ( && ) 
 *   true && true -> true 
 *   true && false -> false
 *   false && false -> false		==> 이 경우에는 첫번째 연산만!!
 *   false && true -> false     ==> 이 경우에는 첫번째 연산만!!
 *   
 *   or 연산 ||
 *   true || true -> true ==> 이 경우에는 첫번째 연산만!!
 *   true || false -> true ==> 이 경우에는 첫번째 연산만!!
 *   false || true -> true 
 *   false || false -> false 
 *   
 */
class OperatorEx{
	public boolean test1() {
		System.out.println("test1");
		return false;
	}
	public boolean test2() {
		System.out.println("test2");
		return true;
	}
}
public class TestOperator2 {
	public static void main(String[] args) {
		OperatorEx ex=new OperatorEx();
		//System.out.println(ex.test1()&&ex.test2());
		//System.out.println(ex.test1()||ex.test2());
		System.out.println(ex.test2()||ex.test1());
	}
}








