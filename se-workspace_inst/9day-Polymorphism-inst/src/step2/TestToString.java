package step2;
class Employee{//extends Object 
	//Employee(){super();}
}
class Employee2{
	String empId;
	String name;
	public Employee2(String empId,String name) {
		this.empId=empId;
		this.name=name;
	}
	// ������̼� : �ǹ��ִ� �ּ�
	// @Override �� �������̵� ��Ģ�� ��߳��� error�� �߻���Ų��
	// Object class�� toString()�޼��带 ���� �������̵��غ��� 
	// �ּҰ� ��� �������� ��ȯ�ϵ��� ������ 
	@Override  
	public String toString() {
		return "empId:"+empId+" name:"+name;
	}	
}

public class TestToString {
	public static void main(String[] args) {
		Employee e=new Employee();
		//Object�� �ڽ��̹Ƿ� toString() ��밡�� 
		// Employee ��ü �ּҰ��� ��ȯ�Ǿ� ��µȴ� 
		System.out.println(e.toString());
		//println ���ο��� ���������� ������ toString()�� ȣ���ϹǷ�
		//�Ʒ��� ���� ����Ҽ��� �ִ� 
		System.out.println(e);
		Employee2 e2=new Employee2("20", "�����");
		System.out.println(e2);
	}
}







