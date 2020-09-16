package step6;

import java.util.ArrayList;

public class TestArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("정지윤");
		list.add("이홍재");
		list.add("이홍재");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.size());
		list.set(2, "강지훈"); //수정 
		System.out.println(list);
		String name=list.remove(1);//삭제
		System.out.println(name+" 요소를 삭제");
		System.out.println(list);		
	}
}







