package step3;

import java.io.File;

public class TestFile {
	public static void main(String[] args) {
		// java.io.File class : ������ �����ϴ� ����� ���� 
		String path="C:"+File.separator+"kosta203";
		File dir=new File(path);
		System.out.println(dir.exists());
		System.out.println(dir.isFile());
		System.out.println(dir.isDirectory());
		System.out.println(dir.getPath());
		String path2=dir.getPath()+File.separator+"iotest2";
		File dir2=new File(path2);
		System.out.println(dir2.mkdirs());
		//���� ���丮�� �̵��ؼ� ���ϰ�ü��ȯ 
		File dir3=dir2.getParentFile();		
		System.out.println(dir3.getPath());
		//kosta203 ���丮�� �ִ� ���� �� ���丮 ������ ��� ����
		String array[]=dir3.list();
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
		File array2[]=dir3.listFiles();
		for(int i=0;i<array2.length;i++) {
			if(array2[i].isFile())
				System.out.println("file:"+array2[i].getName());
			else
				System.out.println("directory:"+array2[i].getName());
		}
	}
}




