package step6;

public class TestExam {
	public static void main(String[] args) {
		//int�� �ִ밪
		//System.out.println(Integer.MAX_VALUE);
		//int�� �ּҰ�
		//System.out.println(Integer.MIN_VALUE);
		int[] point= {30,50,10,20,100};
		int minPoint=point[0];
		int maxPoint=point[0];
		//for���� �̿��� �ּҰ��� ã�´�.
		for(int i=0;i<point.length;i++) {
			if(minPoint>point[i]) {
				minPoint=point[i];
			}else if(maxPoint<point[i]) {
				maxPoint=point[i];
			}
		}
		System.out.println("�ּ� point:"+minPoint);
	}
}
