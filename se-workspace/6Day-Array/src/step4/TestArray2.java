package step4;

public class TestArray2 {
	public static void main(String[] args) {
		//�迭 ����, ����
		int[]salary=new int[4];
		System.out.println(salary.length);
		salary[0]=1000;
		salary[1]=300;
		salary[2]=200;
		salary[3]=500;
		System.out.println("****�� �迭�� salary �Ѿ�****");
		int sum=0;
		//for���� �̿��ؼ� ����
		for(int i=0;i<salary.length;i++) {
			sum+=salary[i];
		}
		System.out.println("�Ѿ�"+sum);
	}
}
