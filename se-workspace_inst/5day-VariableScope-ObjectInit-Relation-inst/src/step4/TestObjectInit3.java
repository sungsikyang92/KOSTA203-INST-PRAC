package step4;

public class TestObjectInit3 {
	public static void main(String[] args) {
		Food f=new Food("«��",7000);
		f.setName("¥���");
		//������ ���� 
		System.out.println(f.getName()+" "+f.getPrice());
		Food f1=new Food("������",10000);
		f=f1;
		//������ ���� 
		System.out.println(f.getName()+" "+f.getPrice());
	}
}



