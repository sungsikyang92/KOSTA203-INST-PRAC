package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Two extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<h1><br><br><br>");
		String name=getServletConfig().getServletName();
		out.println(name);
		out.println("<br>ServletContext에서 dbUrl받아옴");
		String dbUrl=getServletConfig().getServletContext().getInitParameter("dbUrl");
		out.println(dbUrl);
		//One Servlet에서 할당한 ServletContext에 할당한 nick 정보를 반환받아 본다.
		String nick=(String)getServletContext().getAttribute("nick");
		out.println("<br>ServletContext로 부터 One이 할당한 nick을 반환받아옴:" +nick);
		out.println("<br><br><a href=One>One 서블릿 실행</a>");
		out.println("<br><br><a href=contextTest.jsp>contextTest.jsp 실행</a>");
		out.close();
	}

}
