package step5;

public class TestInterface5 {
	public static void main(String[] args) {
		// �迭 length 100 
		FlyerService service=new FlyerService(100);
		service.addFlyer(new Bird());
		service.addFlyer(new Airplane());
		service.addFlyer(new SuperMan());
		service.executeFly();
		/*	���� ����
		 *  ����Ⱑ ���� 
		 *  ���۸��� ���� 
		 */
	}
}
