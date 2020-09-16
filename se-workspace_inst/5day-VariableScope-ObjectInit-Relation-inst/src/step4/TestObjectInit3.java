package step4;

public class TestObjectInit3 {
	public static void main(String[] args) {
		Food f=new Food("짬뽕",7000);
		f.setName("짜장면");
		//실행결과 예상 
		System.out.println(f.getName()+" "+f.getPrice());
		Food f1=new Food("탕수육",10000);
		f=f1;
		//실행결과 예상 
		System.out.println(f.getName()+" "+f.getPrice());
	}
}



