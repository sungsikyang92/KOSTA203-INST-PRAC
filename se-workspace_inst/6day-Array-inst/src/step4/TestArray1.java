package step4;

public class TestArray1 {
	public static void main(String[] args) {
		int age [] ;  // �迭 ���� , int [] age 
		age = new int[3]; // �迭 ��ü ���� 
		age[0] = 10; // �迭 ù��° �濡 10�� ���� 
		System.out.println(age[0]);//�迭�� 0���� �ε����� ���۵�
		System.out.println(age[1]);//�⺻ �ʱ�ȭ 0 
		System.out.println(age[2]);
		age[1]=14;
		age[2]=20;
		System.out.println(age.length);//�迭 �� ���� 
		System.out.println("***age �迭 ��Ҹ� ��� ���***");
		//for �� �̿� -> ���� ���ϱ� �� ��������!!
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
	}
}








