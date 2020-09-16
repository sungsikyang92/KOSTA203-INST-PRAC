package step8;

import java.io.File;

public class MoveFileWorker implements Runnable{
	private int moveCount;
	private int movePeriod;
	public MoveFileWorker(int moveCount, int movePeriod) {
		this.moveCount=moveCount;
		this.movePeriod=movePeriod;
	}
	@Override
	public void run() {
		new File(CommonInfo.MOVIE_PATH).mkdirs();
		new File(CommonInfo.MUSIC_PATH).mkdirs();
		for(int i=0;i<moveCount;i++) {
			try {
				Thread.sleep(movePeriod);
				//저장 디렉토리에서 파일들만 확장자별로 이동 
				moveFiles();
				System.out.println("파일들을 각각 디렉토리로 이동");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//catch
		}//for
	}//run
	public void moveFiles() {
		File orgDir=new File(CommonInfo.MAKE_PATH);
		String movieDir=CommonInfo.MOVIE_PATH;
		String musicDir=CommonInfo.MUSIC_PATH;
		File list[]=orgDir.listFiles();
		for(int i=0;i<list.length;i++) {
			if(list[i].isFile()) {
				String name=list[i].getName();
				File destFile=null;
				if(name.endsWith(".mp3")) {
					destFile=new File(musicDir+File.separator+name);
				}else if(name.endsWith(".avi")) {
					destFile=new File(movieDir+File.separator+name);
				}
				//파일이동 
				list[i].renameTo(destFile);
			}//if
		}//for
	}//method
}//class














