package step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberVO;

/**
 * Servlet implementation class EnterServlet
 */
public class EnterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<MemberVO> list;
	@SuppressWarnings("unchecked")
	@Override
	public void init() throws ServletException {
		// ListListener의 contextInitialized()에서 할당한 list를 반환받는다 
		list=(ArrayList<MemberVO>) getServletContext().getAttribute("list");
	}
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");//응답시 한글처리 
		request.setCharacterEncoding("utf-8");//post 방식 한글처리 
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		//list에 add한다 
		list.add(new MemberVO(name,address));
		out.println(address+"에 사는 "+name+"님 입장을 환영합니다");
		out.println("<br><br><a href=ListServlet>회원입장명단보기</a>");
		out.close();
	}
}






























