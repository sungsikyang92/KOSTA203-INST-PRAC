package step1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int serviceCount;
    private String savePath;
    public ConfigServlet() {
        super();
        System.out.println(getClass().getName()+"생성");
    }
    @Override
    public void init() throws ServletException {
    	//ServletConfig 객체에 저장된 경로를 반환받는다.
    	savePath=this.getServletConfig().getInitParameter("savePath");
    	
    		try {
    			File countFile=new File(savePath);
    			System.out.println(savePath);
    	    	if(countFile.isFile()) {
				BufferedReader br=new BufferedReader(new FileReader(countFile));
				serviceCount=Integer.parseInt(br.readLine());
				System.out.println("init() 실행... 서비스 수, 인스턴스 변수에 할당" +serviceCount);
				br.close();
    	    	}else {
    	    		System.out.println("init() 실행");
    	    	}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
    	} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("서비스 count:");
		out.println(++serviceCount);
		out.close();
		
	}
	@Override
	public void destroy() {
		
		try {
			PrintWriter out = new PrintWriter(new FileWriter(savePath));
			out.println(serviceCount);
			System.out.println("destroy() 실행" +serviceCount+" 서비스수 파일에 저장");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}