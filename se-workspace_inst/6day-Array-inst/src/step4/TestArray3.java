package step4;

public class TestArray3 {
	public static void main(String[] args) {
		// �迭 ����,����,�Ҵ� ���ÿ� 
		int[] point= {200,300,700,100,400};
		// for loop�� �̿��� point �� ��� ��� 
		for(int i=0;i<point.length;i++) {
			System.out.println(point[i]);
		}		
		System.out.println("***point ����� ���***");
		int sum=0;
		int avg=0;
		for(int i=0;i<point.length;i++) {
			sum+=point[i];
		}
		System.out.println("����Ʈ ����:"+sum);
		avg=sum/point.length;
		System.out.println("����Ʈ ���:"+avg);
	}
}








