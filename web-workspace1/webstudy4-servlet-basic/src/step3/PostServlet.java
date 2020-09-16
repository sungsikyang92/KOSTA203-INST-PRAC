package step3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//응답시 컨텐츠 타입 및 한글 처리를 설정
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		//post 방식은 url로 데이터가 전달되는것이 아니라 http request body 영역에 저장되어 전달됨으로 한글처리를 한다.
		request.setCharacterEncoding("utf-8");
		//클라이언트 메세지: blahblahblah
		//클라이언트가 보낸 요청 정보 내의 메세지(입력정보)를 반환
		//<input type="text" name="message">
		String msg=request.getParameter("message");
		out.print("클라이언트가 보낸 메세지: "+msg);
		out.close();
	}

}
