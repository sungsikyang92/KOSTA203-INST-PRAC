package step2.review;

public class TestPolyMorphism6 {
	public static void main(String[] args) {
		ZooService service=new ZooService();
		service.execute(new Monkey());//�����̰� ����Ÿ�� ���
		service.execute(new Tiger());//ȣ���̰� ����ϸ� ���
		service.execute(new Person());
		//����� Ƽ���� �����ϴ�
		//����� ����Ʈ�ϸ� ���
	}
}
