package step1;

public class Input {
	String value="a";
	String innerHTML="b";
	public static void main(String[] args) {
		Input i=new Input();
		System.out.println(i.value);//getting
		i.value="test";//setting
		String data=i.value;
		data="test2";
		System.out.println(data);//지역변수 data에만 할당
		System.out.println(i.value);//객체의 value는 변경되지 않는다
		i.innerHTML="";
		System.out.println(i.innerHTML);
	}
}



