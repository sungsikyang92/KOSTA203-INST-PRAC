package step3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberVO;

/**
 * Servlet implementation class ListServlet
 */
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<MemberVO> list;
	@SuppressWarnings("unchecked")
	@Override
		public void init() throws ServletException {
			// 한번 실행되는 init() 메서드에서 ServletContext로부터 리스트를 반환받아 
			// 인스턴스 변수에 할당한다 
			list=(List<MemberVO>) getServletContext().getAttribute("list");
		}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		//list를 이용해 명단을 for loop로 제공한다 
		for(int i=0;i<list.size();i++) {
			out.println(i+1+". "+list.get(i).getNick()+" "+list.get(i).getEmail()+"<br>");
		}
		out.println("<br><br>");
		out.println("<a href=index.html>등록화면으로</a>");
		out.close();
	}
}














