package test;

import model.CardDAO2;

/**
 * TestTransaction1 
 * Ʈ����� ó���� ���� �ʾ��� �� �߻��Ǵ� ������ Ȯ���ϴ� ���� 
 * ī�� ���̺� ī�� ������ insert �ǰ� 
 * ����Ʈ ���̺� ����Ʈ ������ insert �� �� 
 * ������ �߻��Ǿ��� �� ����Ʈ ������ ��ϵ��� �ʰ� 
 * ī�� ������ �����ϴ� ��츦 ����� ����. 
 * -> ���� ���� 
 * TestTransaction2 
 * Ʈ����� ó���� ���� ��� �۾��� ���������� ����Ǿ��� �� commit 
 * �����߻��� rollback ó���� ���� 
 * 
 * �׽�Ʈ 1 : �������� ������ �Է��� commit Ȯ�� 
 * �׽�Ʈ 2 : point ��Ͻ� ���Ƿ� ������ �߻����� rollback �� �Ǵ� �� Ȯ�� 
 * @author KOSTA
 *
 */
public class TestTransaction2 {
	public static void main(String[] args) {
		try {
			CardDAO2 dao=new CardDAO2();
			dao.registerCardAndPoint("java","������","CGV",1000);//id,name,point_type,point
			System.out.println("ī�� �߱��� ���������� ó���Ǿ����ϴ�");
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println("ī�� �߱ް����� ������ ���� �߱��� ���� �ʾҽ��ϴ�!");
		}
	}
}















