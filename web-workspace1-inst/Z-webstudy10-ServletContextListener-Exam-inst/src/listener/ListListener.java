package listener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import model.MemberVO;

/**
 * Application Lifecycle Listener implementation class ListListener
 *
 */
public class ListListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ListListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * WAS 종료 전에 호출되는 메서드 
     * filePath에 list를 직렬화해서 저장 
     */
    public void contextDestroyed(ServletContextEvent event)  { 
    	String filePath=event.getServletContext().getInitParameter("filePath");
         try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filePath));
			oos.writeObject(event.getServletContext().getAttribute("list"));
			oos.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
    }

	/**
     * 웹 어플리케이션 시작시에 호출되는 메서드 
     * filePath를 확인해서 있으면 list를 역직렬화해서 반환받아 ServletContext에 
     * setAttribute() 하고 없으면 새로 생성해서 ServletContext에 setAttribute() 
     */
    public void contextInitialized(ServletContextEvent event)  { 
        String filePath=event.getServletContext().getInitParameter("filePath");
        File file=new File(filePath);
        if(file.isFile()) {//있으면 file을 역직렬화 
        	try {
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
				event.getServletContext().setAttribute("list", ois.readObject());
				ois.close();
			} catch (IOException | ClassNotFoundException e) {				
				e.printStackTrace();
			}        	
        }else {//없으면 생성해서 할당 
        	event.getServletContext().setAttribute("list", new ArrayList<MemberVO>());
        }
    }//method	
}//class




















