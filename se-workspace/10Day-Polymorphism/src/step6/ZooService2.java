package step6;

import step2.review.Animal;
import step2.review.Person;

public class ZooService2 {

	public void executeAll(Animal[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof Person) {
				((Person) arr[i]).buy();
			}
			arr[i].play();
		}
	}

}
