package step8;

public class Engineer extends Employee{
	private String skill;
	public Engineer(String empNo, String name, int salary, String skill) {
		super(empNo, name, salary);
		this.skill=skill;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill=skill;
	}
	//�޼��� �������̵�: �θ� �޼��带 �ڽſ� �°� ������
	public String getDetails() {
		//�Ʒ��� ���� �θ�޼��带 �̿��ϰ� �߰����׸� �����ϸ� �ȴ�.
		return super.getDetails()+"���:"+skill;
	}
}
