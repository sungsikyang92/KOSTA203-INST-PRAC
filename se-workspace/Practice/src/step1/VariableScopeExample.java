package step1;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1=15;
		if(v1>10) {
			int v2=v1-10;
			System.out.println(v2);
			int v3=v1+v2+5;
			System.out.println(v3);
		}
//		int v3=v1+v2+5;
//		v2�� �ٸ� ��Ͽ� �����Ƿ�, ���� if�� �ȿ� ���� �����Ƿ� v2��� �Ұ�
	}
}
