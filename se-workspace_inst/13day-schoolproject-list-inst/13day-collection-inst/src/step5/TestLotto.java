package step5;

import java.util.Random;
import java.util.TreeSet;

class LottoService{
	// 1~45���� �ߺ����� ���� ������ �� 6���� TreeSet�� ��� ��ȯ  
	public TreeSet<Integer> createLottoNumber() {
		TreeSet<Integer> set=new TreeSet<Integer>();
		Random r=new Random();//������ ���� ����� ���� 
		while(set.size()<6) {//set���� ���(��ȣ)�� 6���� �� ������ 
			int num=r.nextInt(45)+1;//0���� �����ϹǷ� 1�� ���Ѵ� 
			set.add(num);
		}
		return set;
	}	
}
public class TestLotto {
	public static void main(String[] args) {
		LottoService service=new LottoService();
		TreeSet<Integer> set=service.createLottoNumber();
		System.out.println("�̹��� �ζǹ�ȣ:"+set);
	}
}





