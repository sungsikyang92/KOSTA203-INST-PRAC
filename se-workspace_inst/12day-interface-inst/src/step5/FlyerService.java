package step5;

public class FlyerService {
	private Flyer[] array;
	private int index;
	public FlyerService(int length) {
		array=new Flyer[length];
	}
	public void addFlyer(Flyer flyer) {		
		array[index++]=flyer;
	}
	public void executeFly() {
		for(int i=0;i<index;i++) {
			array[i].fly();
		}
	}
}











