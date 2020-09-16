package step6;
class Employee{}
class Engineer extends Employee{}
class Manager extends Employee{}
class Secretary extends Employee{}
class CompanyService{
	// �������� ����ǹǷ� ����� ������ �������� �ϳ��� �޼��忡��
	// ��� ó���� �� �ִ� 
	public void register(Employee e) {
		// instanceof �����ڸ� �̿��� ��ü�� Ÿ���� Ȯ���غ��� 
		if(e instanceof Engineer) {
			System.out.println("�����Ͼ� ��ü�Դϴ�");
		}else if(e instanceof Manager) {
			System.out.println("�Ŵ��� ��ü�Դϴ�");
		}else if(e instanceof Secretary) {
			System.out.println("�� ��ü�Դϴ�");
		}else if(e instanceof Employee) {
			System.out.println("��� ��ü�Դϴ�");
		}
		System.out.println(e+" ��ϿϷ�");
	}
}
public class TestPolymorphism3 {
	public static void main(String[] args) {
		CompanyService service=new CompanyService();
		service.register(new Employee());
		service.register(new Engineer());
		service.register(new Manager());
		service.register(new Secretary());
	}
}
