package step2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class DataService {
	/**
	 * type A ������ TreeSet �� ��ȯ�ǰ� 
	 * type B ������ ArrayList �� ��ȯ�ȴ� 
	 * �پ��� �ڷᱸ��ü�� ��ȯ������ Collection �������̽���
	 * ���� ����ü�̹Ƿ� Collection Ÿ������ ��ȯ�ϸ� �ȴ� 
	 * @param type
	 * @return
	 */
	public Collection<String> searchData(String type) {
		Collection<String> collection=null;
		if(type.equals("A")) {
			collection=new TreeSet<String>();
			collection.add("¥���");
			collection.add("«��");
		}else if(type.equals("B")){
			collection=new ArrayList<String>();
			collection.add("�ҳ�Ÿ");
			collection.add("���");
		}
		return collection;
	}
}












