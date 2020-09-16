package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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
//    private List<MemberVO> userList;
    ArrayList<MemberVO> userList;
    
    @Override
    	public void init() throws ServletException {
    		userList=new ArrayList<MemberVO>();
    		getServletContext().setAttribute("name", userList);
    	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		request.setCharacterEncoding("utf-8");
		String nick=request.getParameter("nick");
		String em=request.getParameter("email");
		userList.add(new MemberVO(nick,em));
		out.print("<h2>");
		out.print(nick+"님이 리스트에 등록되었습니다!");
		out.print("</h2>");
		out.print("<hr>");
		out.print("<a href=ListServlet>등록목록보기</a>");
		out.close();
		
		
	}

}
