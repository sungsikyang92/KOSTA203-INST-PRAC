package step3;
class InformationException extends Exception{
	public InformationException(String message) {
		super(message);
	}
}
class MemberDAO{
	public void registerInfo(String info) throws InformationException {
		if(info==null)
			throw new InformationException("null�̹Ƿ� db�� insert �Ұ�");
		if(info.equals(""))
			throw new InformationException("�����̹Ƿ� db�� insert �Ұ�");		
		System.out.println(info+" database�� insert");
	}
}
public class TestThrows3 {
	public static void main(String[] args) {
		MemberDAO dao=new MemberDAO();
		try {
			//dao.registerInfo("");
			dao.registerInfo(null);
		} catch (InformationException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���α׷� �������");
	}
}




