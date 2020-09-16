package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<h1>관리자 모드<br><br><br>");
//		adminEmail과 adminTel이 필요
//		아래 코드는 하드코딩 - 변경시 소스코드를 수정, 유지보수성이 낮다.
//		String adminEmail="tico99@daum.net";
//		String adminTel="0112345678";
//		ServletConfig를 이용해 이메일과 Tel을 반환
//		코드와 정보를 분리해서 유지보수성을 향상
//		관리자가 변경되어도 코드 수정은 필요하지 않다.
		String adminEmail=getServletConfig().getInitParameter("adminEmail");
		String adminTel=getServletConfig().getInitParameter("adminTel");
		out.print("관리자 이메일: "+adminEmail+"<br>");
		out.print("관리자 TEL: "+adminTel);
		//ServletConfig는 ServletContext 객체의 주소값을 가지고 있다.
		out.print("<br>ServletContext 객체: ");
		out.print(this.getServletConfig().getServletContext());
		out.print("</h1>");
		out.close();
		
	}

}
