package step6;

import step2.review.Animal;
import step2.review.Monkey;
import step2.review.Person;
import step2.review.Tiger;

public class TestPloymorphismArray3 {
	public static void main(String[] args) {
		Animal arr[]= {new Tiger(),new Monkey(), new Person()};
		ZooService2 service=new ZooService2();
		service.executeAll(arr);
			/*ȣ���̰� ����ϸ� ����
			 * �����̰� ����Ÿ�� ���
			 * Ƽ�����ϴ�
			 * ����� ����Ʈ�ϸ� ����
			 */
	}
}
