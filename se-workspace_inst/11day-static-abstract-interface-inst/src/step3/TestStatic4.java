package step3;
class Fish{
	// Object�� member�� ��ü ������ heap ������ ���� ��ü ������ ���Ӱ� ���� �ʱ�ȭ
	int count;
	// ���� ù ������ class loading �� static �� �ʱ�ȭ�ȴ�
	// method area(class area) ������ �ϳ��� ������ ����� 
	static int scount;
	Fish(){
		count++;
		scount++;		
	}
}
public class TestStatic4 {
	public static void main(String[] args) {
		Fish f1=new Fish();
		System.out.println(f1.count);  System.out.println(Fish.scount);
		Fish f2=new Fish();
		System.out.println(f2.count);  System.out.println(Fish.scount);
		Fish f3=new Fish();
		System.out.println(f3.count); System.out.println(Fish.scount);
	}
}	



