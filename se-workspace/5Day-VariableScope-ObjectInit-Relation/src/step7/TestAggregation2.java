package step7;

public class TestAggregation2 {
	public static void main(String[] args) {
		//�Ʒ� �ڵ尡 ����ǵ��� �����ϴ� Ŭ�������� �����غ���.
		Student s=new Student("����������");
		System.out.println(s.getName());//����������
		s.setBook(new Book("�鼳����", "�׸�����"));
		System.out.println(s.getBook().getTitle());//�鼳����
		System.out.println(s.getBook().getAuthor());//�׸�����

	}
}
