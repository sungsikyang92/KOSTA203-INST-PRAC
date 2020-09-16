package step6;
//������ �����ε� �׽�Ʈ 
// VO : Value Object 
class MemberVO{
	private String id; // �ʼ� �Է� �׸� 
	private String password; // �ʼ� �Է� �׸� 
	private String hobby; // ���� �Է� �׸� 
	public MemberVO(String id,String password) {
		this.id=id;
		this.password=password;
	}
	// ������ �����ε� -> �پ��� �Ű�������  �Է¹ޱ� ���� 
	// �����ڸ� ������ �����Ѵ� 
	public MemberVO(String id,String password,String hobby) {
		this.id=id;
		this.password=password;
		this.hobby=hobby;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}	
}
public class TestOverloading2 {
	public static void main(String[] args) {
		MemberVO vo1=new MemberVO("java","1234");
		System.out.println(vo1.getId()+" "+vo1.getPassword()
		+" "+vo1.getHobby());
		MemberVO vo2=new MemberVO("spring","mybatis","�");
		System.out.println(vo2.getId()+" "+vo2.getPassword()
		+" "+vo2.getHobby());
	}
}
























