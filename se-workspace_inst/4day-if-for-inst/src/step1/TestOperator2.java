package step1;
/*
 *   AND �� OR ���� 
 *   
 *   AND ���� -> ��� true �� ��쿡�� true
 *   OR ���� -> ��� false �� ��쿡�� false 
 *   
 *   and ���� ( && ) 
 *   true && true -> true 
 *   true && false -> false
 *   false && false -> false		==> �� ��쿡�� ù��° ���길!!
 *   false && true -> false     ==> �� ��쿡�� ù��° ���길!!
 *   
 *   or ���� ||
 *   true || true -> true ==> �� ��쿡�� ù��° ���길!!
 *   true || false -> true ==> �� ��쿡�� ù��° ���길!!
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








