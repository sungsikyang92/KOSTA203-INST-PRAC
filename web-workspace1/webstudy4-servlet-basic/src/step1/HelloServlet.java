package step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HelloServlet doGet() 실행");
		//charset=utf-8은 응답시 한글처리를 위해 명시
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("Hello Servlet<br><br>");
		out.println("반갑습니다 서블릿 get방식으로 요청하셨군요!");
		//사용자가 전송한 데이터를 반환받는다.
		String info=request.getParameter("info");
		out.println("<hr>사용자가 전송한 정보: "+info);
		out.close();		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HelloServlet doPost() 실행");
		//charset=utf-8은 응답시 한글 처리를 위해 명시
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("Hello Servlet<br><br>");
		out.println("<font color=red>반갑습니다 서블릿  poset방식으로 요청하셨군요!</font>");
		//post방식일때는 별도의 한글처리가 필요하다.
		request.setCharacterEncoding("utf-8");
		//사용자가 전송한 데이터를 반환받는다.
		String info=request.getParameter("info");
		out.println("<hr>사용자가 전송한 정보: "+info);
		out.close();
		
		
	}

}
