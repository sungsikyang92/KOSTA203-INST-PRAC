package step6;

public class TestExam {
	public static void main(String[] args) {
		//int형 최대값
		//System.out.println(Integer.MAX_VALUE);
		//int형 최소값
		//System.out.println(Integer.MIN_VALUE);
		int[] point= {30,50,10,20,100};
		int minPoint=point[0];
		int maxPoint=point[0];
		//for문을 이용해 최소값을 찾는다.
		for(int i=0;i<point.length;i++) {
			if(minPoint>point[i]) {
				minPoint=point[i];
			}else if(maxPoint<point[i]) {
				maxPoint=point[i];
			}
		}
		System.out.println("최소 point:"+minPoint);
	}
}
