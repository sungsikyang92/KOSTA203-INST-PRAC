package step6;
/*	�Ʒ� Ŭ������ ���θ޼��忡 �����Ǵ� Ŭ�������� �����ϴ� ���� 
 * 
 */
public class TestInheritance3 {
	public static void main(String[] args) {
		// �Ϲ� ��� ��ü ���� 
		Employee e=new Employee("20","������",1000);
		//20 ������ 1000
		System.out.println(e.getEmpNo()+" "+e.getName()+" "+e.getSalary());
		
		  Engineer en=new Engineer("19","����",1200,"java");
		  System.out.println(en.getEmpNo()+" "+en.getName()
		  +" "+en.getSalary()+" "+en.getSkill());
		 
		// 19 ���� 1200 java 
		
	}
}









