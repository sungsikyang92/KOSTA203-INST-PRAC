package step2.review;

public class ZooService {
	public void execute(Animal a) { //�θ�Ÿ���� �Ű������� ó���ϸ� �ڽĵ� ��� ó��!
		// Person ��ü���� Ȯ�� 
		if(a instanceof Person) { // Person ��ü�̸� 
			// ticketing() �� ȣ�� -> �ڽ��� ������ �޼��� -> Object down casting
			((Person) a).ticketing();
		}
		a.play();//�������̵��� �ڽ� �޼��尡 ���� ����� 
	}
}
