package step3;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		// <String> -> Generic , Set에 추가될 요소의 타입을 명시하는 것을 권장
		TreeSet<String> set=new TreeSet<String>();
		set.add("고병철");
		set.add("정준상");
		set.add("강지훈");
		set.add("고병철");//중복은 인정하지 않음 
		set.add("고병철");//중복 
		System.out.println(set.size());//3
		// TreeSet의 특징은 정렬기능이 내장되어 있다 
		System.out.println(set);//toString() 오버라이딩되어 실제 요소 출력		
		
	}
}


























