package step1;
/*
 * 	AND와 OR연산
 * 
 * 	AND연산 → 모두 true일 경우에만 true
 * 	OR연산  → 모두 false일 경우에만 false
 * 
 * 	and연산(&&)
 * 	true&&true  → true
 * 	true&false → false
 * 	false&true → false				→  → 이 경우에는 천번째 연산만!
 * 	false&false  →  false				→  → 이 경우에는 첫번째 연산만!
 * 
 * 	or연산||
 * 	true||true  → true					 →  → 이 경우에는 첫번째 연산만!
 * 	false||false  → true					 →  → 이 경우에는 첫번째 연산만!
 * 	false||true  → true
 * 	false||false  → false
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

public class TestOperator2{
	public static void main(String[] args) {
		OperatorEx ex=new OperatorEx();
		//System.out.println(ex.test1()&&ex.test2());
		//System.out.println(ex.test1()||ex.test2());
		System.out.println(ex.test2()||ex.test1());
	}
}

