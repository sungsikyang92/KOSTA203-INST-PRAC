package step3;

import step2.CDPlayer;
import step2.Youtube;

public class TestInterface3 {
	public static void main(String[] args) {
		PlayerService service=new PlayerService();
		service.execute(new Youtube());
		service.execute(new CDPlayer());
		/*�������� ����ϴ�
		 * cd�� �ִ�
		 * cd�� ����ϴ�
		 */
	}
}
