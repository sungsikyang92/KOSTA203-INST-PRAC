package step8;
/**
 * MakeFileWorker Thread�� 
 * ������ ����ŭ ������ �ð� �������� �����ϰ� 
 * ������ ����(0.avi or 1.mp3)�Ͽ� 
 * CommonInfo�� MAKE_PATH�� �����Ѵ�. 
 * 
 * MoveFileWorker Thread�� 
 * MAKE_PATH�� ����� ���ϵ��� Ȯ���ڿ� ���� 
 * MOVIE_PATH �� MUSIC_PATH�� �̵���Ų��. 
 * ������ ����ŭ ������ �ð��������� �̵���Ų��. 
 * @author KOSTA
 *
 */
public class TestThreadEx8 {
	public static void main(String[] args) {
		int makeCount=30;//������ ���ϼ� 
		int makePeriod=1000; //1�� �������� ���� 
		int moveCount=5;//�̵���ų �۾��� 
		int movePeriod=7000;//7�� �������� �̵� 
		MakeFileWorker makeWorker=new MakeFileWorker(makeCount,makePeriod);
		MoveFileWorker moveWorker=new MoveFileWorker(moveCount,movePeriod);
		// �� ��ü�� �̿��� ���� ������ �����ϰ� start 
		new Thread(makeWorker).start();
		new Thread(moveWorker).start();
	}
}

















