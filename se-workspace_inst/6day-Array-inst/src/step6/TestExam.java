package step6;

public class TestExam {
	public static void main(String[] args) {
		// int �� �ִ밪 
		//System.out.println(Integer.MAX_VALUE);
		// int �� �ּҰ� 
		//System.out.println(Integer.MIN_VALUE);
		int[] point= {30,50,10,20,100};
		// point �迭 ����� �ּҰ��� ã�� ����غ��� 
		int minPoint=Integer.MAX_VALUE;
		// for ���� �̿��� �ּҰ��� ã�´� 
		for(int i=0;i<point.length;i++) {
			if(point[i]<minPoint) {
				minPoint=point[i];
			}
		}
		System.out.println("�ּ� point:"+minPoint);
	}
}









