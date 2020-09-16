package step5;

import java.util.Random;
import java.util.TreeSet;

class LottoService{
	// 1~45까지 중복되지 않은 임의의 수 6개를 TreeSet에 담아 반환  
	public TreeSet<Integer> createLottoNumber() {
		TreeSet<Integer> set=new TreeSet<Integer>();
		Random r=new Random();//랜덤한 수를 만들기 위해 
		while(set.size()<6) {//set안의 요소(번호)가 6개가 될 때까지 
			int num=r.nextInt(45)+1;//0부터 시작하므로 1을 더한다 
			set.add(num);
		}
		return set;
	}	
}
public class TestLotto {
	public static void main(String[] args) {
		LottoService service=new LottoService();
		TreeSet<Integer> set=service.createLottoNumber();
		System.out.println("이번주 로또번호:"+set);
	}
}





