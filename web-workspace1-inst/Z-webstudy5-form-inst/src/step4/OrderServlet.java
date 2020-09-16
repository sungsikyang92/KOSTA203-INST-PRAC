package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OrderServlet
 */
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		request.setCharacterEncoding("utf-8");//post 방식 한글처리 
		out.println("주문항목<br><br>");
		String menu=request.getParameter("menu");
		//연산을 위해서 int 형으로 변환한다( 웹에서는 모든 정보가 다 문자열임! ) 
		int count=Integer.parseInt(request.getParameter("count"));
		out.println(menu+" "+count+"인분<br>");
		if(count>=3) {
			out.println("서비스 소주 두병!!");
		}
		out.close();
	}
}
























