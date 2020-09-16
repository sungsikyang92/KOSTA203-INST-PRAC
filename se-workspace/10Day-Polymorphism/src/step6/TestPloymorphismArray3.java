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
			/*호랑이가 사냥하며 놀자
			 * 원숭이가 나무타며 놀다
			 * 티켓팅하다
			 * 사람이 데이트하며 놀자
			 */
	}
}
