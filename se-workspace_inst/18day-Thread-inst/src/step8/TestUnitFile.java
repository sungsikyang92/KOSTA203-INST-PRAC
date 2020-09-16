package step8;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/*
 *  ������ ���α׷� ������ �ռ� File API�� �׽�Ʈ �ϴ� ���� 
 */
class FileService{
	// ������ ��ο� ���丮 �� ���� ���� 
	public void testCreateFile() throws IOException {
		File dir=new File(CommonInfo.MAKE_PATH);
		if(dir.isDirectory()==false) {
			dir.mkdirs();//���丮 ����
		}
		// �Ʒ� ���� ���� �κп� createFileName�޼��带 ����ؼ� 
		// 0~9������ ������ Ȯ���ڸ� ���� ������ �����غ��� 
		for(int i=0;i<10;i++) {
			File file=new File(CommonInfo.MAKE_PATH+File.separator+createFileName(i));
			file.createNewFile();
		}
	}
	//���ϸ��� ����� �ִ� �޼��� 
	public String createFileName(int name) {
		Random r=new Random();
		if(r.nextBoolean())
			return name+".mp3";
		else
			return name+".avi";
	}
	public void moveFile() {
		//renameTo(dest) : boolean  -> File class �� method�� ������ �̵����Ѻ��� 
		String makeTestPath=CommonInfo.MAKE_PATH+File.separator+"movetest";
		//�������� 
		File orgFile=new File(CommonInfo.MAKE_PATH+File.separator+"0.mp3");
		//����������
		File destFile=new File(makeTestPath+File.separator+orgFile.getName());
		System.out.println("�������ϰ��:"+orgFile.getPath());
		System.out.println("�̵���ų ���ϰ��:"+destFile.getPath());
		destFile.getParentFile().mkdirs();
		//������ �̵���Ų�� 
		boolean result=orgFile.renameTo(destFile);
		System.out.println("�̵� "+result);
	}
	// ���丮���� �ִ� ������ ��� ������ ���丮�� �̵���Ű�� �޼��� 
	public void moveFiles() {
		//�̵���ų ���
		String makeTestPath=CommonInfo.MAKE_PATH+File.separator+"movetest";
		//����� ���� ������ �ִ� ��� 
		String orgDir=CommonInfo.MAKE_PATH;
		File orgDirectory=new File(orgDir);
		File[] list=orgDirectory.listFiles();
		for(int i=0;i<list.length;i++) {
			if(list[i].isFile()) {
				//System.out.println(list[i].getName());
				//renameTo �� �̿��� ���ϵ��� �̵����Ѻ��� 
				if(list[i].getName().endsWith(".mp3")) {
					System.out.println("mp3�̵�");
				}else {
					System.out.println("avi�̵�");
				}
				File dest=new File(makeTestPath+File.separator+list[i].getName());
				list[i].renameTo(dest);
			}
		}
	}
}
public class TestUnitFile {
	public static void main(String[] args) {
		FileService service=new FileService();
		/*
		 * try { service.testCreateFile(); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
		//service.moveFile();
		service.moveFiles();
	}
}





