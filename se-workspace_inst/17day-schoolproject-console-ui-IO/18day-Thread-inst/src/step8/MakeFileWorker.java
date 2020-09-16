package step8;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class MakeFileWorker implements Runnable{
	private int makeCount;
	private int makePeriod;
	public MakeFileWorker(int makeCount, int makePeriod) {
		this.makeCount=makeCount;
		this.makePeriod=makePeriod;
	}
	@Override
	public void run() {
		new File(CommonInfo.MAKE_PATH).mkdirs();
		for(int i=0;i<makeCount;i++) {
			try {
				String path=CommonInfo.MAKE_PATH+File.separator+createFileName(i);
				File file=new File(path);
				file.createNewFile();
				System.out.println(file.getName()+" 파일생성");
				Thread.sleep(makePeriod);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//for
	}//run
	public String createFileName(int name) {
		Random r=new Random();
		if(r.nextBoolean())
			return name+".mp3";
		else
			return name+".avi";
	}
}









