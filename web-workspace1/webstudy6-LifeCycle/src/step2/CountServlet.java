package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountServlet
 */
public class CountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int count;
    public CountServlet() {
        super();
        System.out.println("CountServlet 객체 생성");
        count++;
    }
    @Override
    public void init() throws ServletException {
    	System.out.println("init() 실행");
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<h3>");
		out.print("접속수: ");
		out.print(++count);
		out.print("</h3>");
		out.close();
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

}
