package step1;

import java.util.StringTokenizer;

public class TestStringAndStringBuilder {
	public static void main(String[] args) {
		String s1="아이유";
		String s2="아이유";
		System.out.println(s1.concat("짱"));//마지막에 문자열 추가 그러나 일시적
		System.out.println(s1);//위에 concat으로 짱을 마지막에 추가하였으나 일시적이고 기존 s1은 변화되지 않는다.
		System.out.println(s1.replace("유","셔"));//"유"자를 "셔"로 변경 으로 일시적 변경
		System.out.println(s1);//"짱"의 경우와 마찬가지로 replace또한 일시적 변경이며 기존 s1은 변화시키지 않는다.
		System.out.println(s1==s2);
		System.out.println(s1.contentEquals(s2));//11번째 줄의 방식이아닌 12번째 방식으로 비교하여야 한다.
		//이유는 아래의 방식처럼 문자열을 만들수도 있기 때문이다.
		String s3=new String("아이유");
		System.out.println(s1==s3);//false → equals()로 비교해야 한다. 같은 문자열이 추가되었으나 다른 객체등록 방식으로 false로 뜸.
		System.out.println(s1.equals(s3));
		System.out.println("**********************************");
		StringBuilder sb=new StringBuilder("아이유");
		System.out.println(sb);
		//System.out.println(s1==sb);//타입이 다르므로 비교 자체가 되지 않는다.
		System.out.println(s1==sb.toString());// 이렇게 비교하면 안된다! equals()사용!
		System.out.println(s1.equals(sb.toString()));
		System.out.println(s1.contentEquals(sb));//타입이 달라도 내용을 비교한다. 같은 아이유 이므로 true
		System.out.println(sb.append("왕"));//문자열 자체가 변경된다.맨뒤에 "왕"이 추가됨
		System.out.println(sb);//기존 sb가 append로 인해 변경됨.
		StringBuffer sbf=new StringBuffer("뻐이장가가니");
		System.out.println(sbf.reverse());
		System.out.println("*****StringTokenizer*****");
		String names="고병철,강준상,곰,강지훈,개미";
		StringTokenizer stk=new StringTokenizer(names,",");
		while(stk.hasMoreTokens())
			System.out.println(stk.nextToken());//하나씩 순서대로 뽑아와서 출력됨
	}
}
