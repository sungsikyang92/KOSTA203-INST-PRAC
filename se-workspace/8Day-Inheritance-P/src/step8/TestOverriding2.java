package step8;

public class TestOverriding2 {
	public static void main(String[] args) {
		Employee e=new Employee("20", "������", 1500);
		System.out.println(e.getDetails());
		//�����ȣ:20 �����:������ ����:1500
		Engineer en=new Engineer("18", "��ȫ��", 1700, "spring");
		System.out.println(en.getDetails());
		//�����ȣ:18 �����:��ȫ�� ����:1700 ���:spring
	}
}
