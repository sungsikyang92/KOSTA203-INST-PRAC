package test;

import model.CardDAO;

/**
 * Ʈ����� ó���� ���� �ʾ��� �� �߻��Ǵ� ������ Ȯ���ϴ� ���� 
 * ī�� ���̺� ī�� ������ insert �ǰ� 
 * ����Ʈ ���̺� ����Ʈ ������ insert �� �� 
 * ������ �߻��Ǿ��� �� ����Ʈ ������ ��ϵ��� �ʰ� 
 * ī�� ������ �����ϴ� ��츦 ����� ����. 
 * -> ���� ���� 
 * @author KOSTA
 *
 */
public class TestTransaction1 {
	public static void main(String[] args) {
		try {
			CardDAO dao=new CardDAO();
			dao.registerCardAndPoint("java2","�����","�Ե�",1000);//id,name,point_type,point
			System.out.println("ī��� ����Ʈ insert ok");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}















