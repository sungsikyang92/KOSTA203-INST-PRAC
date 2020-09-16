package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		request.setCharacterEncoding("utf-8");
		String menu=request.getParameter("menu");
		int count=Integer.parseInt(request.getParameter("count"));
		out.println("주문항목: "+"<br>");
		out.print(menu+" "+count+"인분"+"<br>");
		if(count>=3) {
			out.print("서비스 소주 2병"+"<br>");
			out.print("3인분 이상 시켜서 소주 2병 줌");
		}
	}

}
