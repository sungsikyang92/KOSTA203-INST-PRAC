package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberVO;

/**
 * Servlet implementation class RegServlet
 */
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;  
	// 멀티 스레드에 의해 공유되는 객체이므로 동기화 처리를 해준다 
	//private ArrayList<MemberVO> list;
	private List<MemberVO> list;// 동기화 처리한 리스트로 변경해본다 
	@Override
		public void init() throws ServletException {
			//init() 메서드는 단 한번 실행되고 ServletContext 객체를 사용할 수 있다. 
			//ServletContext에 list를 생성해 할당한다 
			//list=new ArrayList<MemberVO>();
		   // 동기화 처리된 리스트로 할당하는 것으로 변경해본다 
			list=Collections.synchronizedList(new ArrayList<MemberVO>());
			getServletContext().setAttribute("list", list);
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		//post 방식 한글처리 
		request.setCharacterEncoding("utf-8");
		String nick=request.getParameter("nick");
		String email=request.getParameter("email");
		//ServletContext에 저장된 list에 등록 회원 정보를 할당한다 
		list.add(new MemberVO(nick,email));
		out.println(nick+" 님 리스트에 등록되었습니다<br><br>");
		out.println("<a href=ListServlet>등록목록보기</a>");
		out.close();
	}
}






























