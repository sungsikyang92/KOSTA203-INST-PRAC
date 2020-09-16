package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class TestListener
 *
 */
@WebListener
public class TestListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public TestListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         System.out.println("contextDestroyed");
    }
	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     * 웹어플리케이션 시작시 한번 실행 
     * db driver loading은 시스템에서 한번만 실행하면 되므로 contextInitialized에서 
     * 하는 것이 적합하다. 
     */
    public void contextInitialized(ServletContextEvent sce)  {
    	String dbDriver=sce.getServletContext().getInitParameter("dbDriver");
    	try {
			Class.forName(dbDriver);
			System.out.println("contextInitialized db driver loading");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
    }	
}


















