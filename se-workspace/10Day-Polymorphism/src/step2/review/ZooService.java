package step2.review;

public class ZooService {
	public void execute(Animal a) {
		a.play();
		if(a instanceof Person) {
			((Person) a).buy();
		}
	}
}
