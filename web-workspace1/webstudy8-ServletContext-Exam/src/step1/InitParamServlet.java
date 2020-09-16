package step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParamServlet
 */
public class InitParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitParamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<h2>");
		//ServletContext의 초기 파라미터(Init-param)를 반환받아 화면에 출력
		//직접 adminEmail의 정보(data)를 코드상에 명시하지 않고(하드코딩 하지 않고)
		//이후 변경에 유연하게 대처하기 위해(유지보수성을 위해)
		//ServletContext의 초기 파라미터를 이용해 정보를 반환받는다
		String adminEmail=getServletContext().getInitParameter("adminEmail");
		out.print(getServletConfig().getServletName()+"<br>");
		out.print("관리자 이메일: "+adminEmail+"<br>");
		out.print("<a href=InitParamServlet2>두번째 서블릿</a>");
		out.print("</h2>");
		out.close();
	}

}
