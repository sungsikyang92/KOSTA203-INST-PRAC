package step5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		request.setCharacterEncoding("utf-8");
		out.print("선택한 영화"+"<br>");
		String[] movie=request.getParameterValues("movie");
		for(int i=0;i<movie.length;i++) {
			out.print(movie[i]+"이(가) 선택되었습니다."+"<br>");		
		}
		
		out.close();
	}

}
