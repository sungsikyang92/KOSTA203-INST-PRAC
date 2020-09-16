package step6;
/* 자바 스레드 스케줄링은 우선 순위 방식을 채택.
 * 이를 확인하는 예제 
 * 테스트 스레드를 20개 생성해 start 시키고 
 * 그 중 하나를 우선순위를 가장 높게 설정한 다음 결과를 확인.
 */
class Worker implements Runnable{
	@Override
	public void run() {
		//현재 실행중인 스레드 이름을 반환받는다 
		String name=Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		for(long l=0;l<9000000000L;l++) {			
		}
		System.out.println(name+" 스레드 실행완료! 우선순위:"+priority);
	}	
}
public class TestThread6 {
	public static void main(String[] args) {
		System.out.println("**main thread 시작**");
		Worker w=new Worker();
		/*
		 * Thread t1=new Thread(w,"1번째 일꾼 스레드"); t1.setPriority(9); t1.start();
		 */
		// 20개의 스레드를 생성하고 start 하되 9번째 스레드는 우선순위를 10으로 할당한다 
		for(int i=1;i<=20;i++) {
			Thread t=new Thread(w,i+"번째 일꾼 스레드");
			if(i==9)
				t.setPriority(Thread.MAX_PRIORITY);
			t.start();
			System.out.println(i+"번째 일꾼 스레드 start");//start는 실행가능상태로 보낸다
		}
		System.out.println("**main thread 종료**");
	}
}

















