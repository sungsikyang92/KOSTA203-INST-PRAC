package step2;

public class TestException2 {
	public static void main(String[] args) {
		//Exception �߻��ϸ� ���α׷��� ���� �ߴ��Ѵ�
		//Exception�� �߻��ϸ� JVM�� ���� ���� ���� �� ����������
		//Exception �ֿ� Ű������ try catch�� �̿���
		//���� ó���� �ϰ� ���α׷��� ���� �����ϵ��� �غ���.
		String name="���ػ�";
		name=null;
		try {//try�� ���ܹ߻���������
			System.out.println(name.length());
		}catch(NullPointerException ne) {//catch ���ܹ߻��� ����帧 ����
			System.out.println("����۾�����");
		}
		System.out.println("���α׷� ���� ����");
	}
}
