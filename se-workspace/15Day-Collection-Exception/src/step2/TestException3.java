package step2;

import java.util.ArrayList;

public class TestException3 {
	public static void main(String[] args) {
		//Exception �߻��ϸ� ���α׷��� ���� �ߴ��Ѵ�
		//Exception�� �߻��ϸ� JVM�� ���� ���� ���� �� ����������
		//Exception �ֿ� Ű������ try catch�� �̿���
		//���� ó���� �ϰ� ���α׷��� ���� �����ϵ��� �غ���.
		//�ϳ��� try�� �ȿ� �پ��� ���ܰ� �߻��� �� �����Ƿ�
		//�������� catch ������ �����ϴ�.
		//�� �ڽ�Ŭ�������� �θ������ �����ؾ� �Ѵ�.
		//Exception�� �ִ��� ��ü������ catch�ϴ� ���� ����.
		/*����۾�����(Ʈ�����)
		 * try{
		 * 1. ī�� ���� �� ī�� Exception
		 * 2. �۾� ����
		 * 3. �ݾ� �Է� �� �ܾ׺��� Exception
		 * 4. ���
		 * }catch(ī��Exception){
		 * }catch(�ݾ�Exception){
		 * }catch(Exception)
		 */
		ArrayList<String> list=new ArrayList<String>();
		String name="���ػ�";
		name=null;
		try {//try�� ���ܹ߻���������
			System.out.println(list.get(1));//�ƹ��͵� ���µ� 2��°�� �����Ѵٰ���
			System.out.println(name.length());
		}catch(NullPointerException ne) {//catch ���ܹ߻��� ����帧 ����
			System.out.println("����۾�����");
		}catch(Exception e) {
			System.out.println("����۾�����2");
		}
		System.out.println("���α׷� ���� ����");
	}
}
