package step3;

import step2.CDPlayer;
import step2.Player;

// Service : 비즈니스 로직 담당 객체 
public class PlayerService {
	//상위 인터페이스 타입으로 매개변수를 정의한다 
	public void execute(Player p) {
		if(p instanceof CDPlayer) {
			((CDPlayer) p).insertCd();
		}
		p.play();
	}
}










