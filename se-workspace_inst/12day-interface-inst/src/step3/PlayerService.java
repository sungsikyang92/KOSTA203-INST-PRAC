package step3;

import step2.CDPlayer;
import step2.Player;

// Service : ����Ͻ� ���� ��� ��ü 
public class PlayerService {
	//���� �������̽� Ÿ������ �Ű������� �����Ѵ� 
	public void execute(Player p) {
		if(p instanceof CDPlayer) {
			((CDPlayer) p).insertCd();
		}
		p.play();
	}
}










