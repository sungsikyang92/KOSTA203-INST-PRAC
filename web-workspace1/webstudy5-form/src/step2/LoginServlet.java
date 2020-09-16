package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("memberId");
		String ps=request.getParameter("memberPass");
		String em=request.getParameter("memberEmail");
		out.print("아이디: "+id+"<br>");
		out.print("패스워드: "+ps+"<br>");
		out.print("이메일: "+em+"<br>");
		out.close();
	}

}
