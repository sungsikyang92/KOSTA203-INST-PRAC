package step7;
class Employee{}
class Engineer extends Employee{}
class Manager extends Employee{}
class Secretary extends Employee{}
public class TestInstanceof {
	public static void main(String[] args) {
		//instanceof ������: is a ���谡 �����Ǹ� true�� ��ȯ
		Employee e=new Manager();
		if(e instanceof Manager) {//true
			System.out.println("������");
		}
		if(e instanceof Secretary) {//false
			System.out.println("��");
		}
		if(e instanceof Employee) {//true, Manager is a Employee
			System.out.println("���");
		}
	}
}
