package step4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestMap2 {
	public static void main(String[] args) {
		// ������ ��� 
		LinkedHashMap<String, Product> map
				=new LinkedHashMap<String, Product>();
		Product p=new Product("1","ī��","����",1500);
		map.put(p.getId(),p);
		Product p2=new Product("2","Ŭ����","�Ե�",1700);
		map.put(p2.getId(),p2);
		System.out.println(map);
		// ��ǰ���̵� 2�� ��ǰ�� name�� ��� -> Ŭ���� 
		System.out.println(map.get("2").getName());
		// ���� map�� key�鸸 ����, ����غ��� 
		Set<String> set=map.keySet();
		Iterator<String> it=set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("********");
		// ���� map�� value �鸸 ����غ���  map���� values() �޼��尡 ���� 
		//Collection<Product> col=map.values();		
		//Iterator<Product> it2=col.iterator();
		Iterator<Product> it2=map.values().iterator();
		while(it2.hasNext())
			System.out.println(it2.next());
	}
}

















